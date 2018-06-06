package com.hlj.Arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description
 * @Author HealerJean
 * @Date 2018/5/8  上午9:53.
 */
public class ListForEach {

    /**
         List对象有一个成员变量modCount，它代表该List对象被修改的次数，每对List对象修改一次，modCount都会加1.

     　　Itr类里有一个成员变量expectedModCount，它的值为创建Itr对象的时候List的modCount值。
       用此变量来检验在迭代过程中List对象是否被修改了，如果被修改了则抛出java.util.ConcurrentModificationException异常。
       在每次调用Itr对象的next()或者remove方法的时候都会调用checkForComodification()方法进行一次检验，
       checkForComodification()方法中做的工作就是比较expectedModCount 和modCount的值是否相等，如果不相等，
      就认为还有其他对象正在对当前的List进行操作，那个就会抛出ConcurrentModificationException异常。

      将list对象里面的“c"删除了，同时list对象的modCount值加1，但是Itr对象的expectedModCount没有变，他们肯定是不相等了。等再一次执行next()方法的时候调用了checkForComodification()方法，这时候就抛出异常了。
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        //CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            String str = (String) iterator.next();
//            if(str.equals("c")){ //a b checkForComodification
//                list.remove(str);
//            }
            if(str.equals("d")){ // a b c
                //它是通过Itr的对象的cursor与List对象的size值来判断是否还有未迭代的对象，
                // 当遍历完“d"的时候cursor=4，删除”d"的时候，List对象的size就会减1，size首先为5，后来变为4，
                // 这时候cursor和size是相等的，hasNext()方法返回的是false，就认为遍历结束了，
                // 所以删除以后没有进去执行next()方法了，就没有抛出异常了，当然"e"也没有输出来。
                list.remove(str);
            }else{
                System.out.println(str);
            }
        }

    }


    @Test
    public void remove(){
        List<String> list = new ArrayList();
        list.add("aaaaaa");
        list.add("bbbbbb");
        list.add("cccccc");
        list.add("dddddd");
        list.add("eeeeee");

        Iterator it = list.iterator();
        //it.remove(); //删除的是上一个元素 IllegalStateException
        int i = 0;
        String s = null;
        while(it.hasNext()){
            if(i==2){
//              list.remove(it.next()); 如果用list.remove(it.next());会报异常checkForComodification
                it.remove();
            }
            System.out.println("第"+i+"个元素"+it.next());
            i++ ;
        }
        System.out.println("----------------");
        Iterator it2 = list.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
