package com.hlj.Arraylist;

import java.util.*;
import java.util.stream.Collectors;

import com.hlj.arith.Array;
import com.sun.deploy.util.StringUtils;
import org.junit.Test;

import com.hlj.arith.killperson.Person;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月13日 下午4:43:59 
 * 类说明 
 */
public class ArraylistTest {

  
    /**
     * 2、设定arraylist最大的size
     * ArrayList中没有值时，则size为0 
     * 不管size初始化为几 其实是没有意义的，只会动态的的得到它的大小
     */
	@Test
    public  void NewArraylist(){
    	
    	List<String> strs = new ArrayList<String>(2);
    	//里面没有值 自然之类得到的 大小为 0
    	System.out.println(strs.size());
    	
    	strs.add("第一个size");
    	strs.add("第一个size");
    	strs.add("第一个size");
    	strs.add("第一个size");
    	System.out.println(strs.size());

    	
    }
    
    /**
     * 1、测试remove方法 remove(object 或者是 index(int))
     */
	@Test
	public  void RemoveMethod() {
		List<String> empList = new ArrayList<String>();  
        empList.add("String one");  
        empList.add("String two");
          
        String str1 = "String one";
        empList.remove(str1); 
        
        System.out.println(empList.size()+empList.get(0));   // 1 
        
        Iterator it = empList.iterator();  
        while(it.hasNext()){  
            String emp = (String)it.next();  
            System.out.println(emp.toString());    
        }
        
        empList.add("String one");  
        empList.remove(0);
        System.out.println("remove 0 也就是去掉了 String two");
        Iterator it2 = empList.iterator();  
        while(it2.hasNext()){  
            String emp = (String)it2.next();  
            System.out.println(emp.toString());    
        }

	}  
	
	/**
	3、 list 放入有顺序
	 */
	@Test
	public void listHaveAddSort(){
		List<Person> persons= new ArrayList<Person>();
		Person person = new Person(0, "HealerJean");
		Person person2 = new Person(0, "HealerJean");
		persons.add(0,person);
		persons.add(3,person2); //报错，因为没有 2
	}
	
	
	/**
	 4、list 排序
	 */
	@Test
	public void listSort(){
	/**
	 * 1、list 内部Integer排序
	 */
        System.out.println("1、list 内部Integer排序");
		List<Integer> nums = new ArrayList<Integer>();  
        nums.add(3);  
        nums.add(5);  
        nums.add(1);  
        nums.add(0);  
        System.out.println(nums);  
        Collections.sort(nums);  
        System.out.println(nums);  
        
    	/**
    	 * 2、list 内部对象
    	 */
    	System.out.println("2、list 内部对象");	   
        List<SortEntry> sortEntries = new ArrayList<SortEntry>();  
        sortEntries.add(new SortEntry(23, 100));  
        sortEntries.add(new SortEntry(27, 98));  
        sortEntries.add(new SortEntry(29, 99));  
        sortEntries.add(new SortEntry(29, 98));  
        sortEntries.add(new SortEntry(22, 89));  
        Collections.sort(sortEntries, new Comparator<SortEntry>() {  
  
            @Override  
            public int compare(SortEntry o1, SortEntry o2) {  
                int i = o1.getScore() - o2.getScore();  //先按照年龄排序  
                if(i == 0){  
                    return o1.getAge() - o2.getAge();  //如果年龄相等了再用分数进行排序  
                }  
                return i;  
            }  
        });  
        for(SortEntry stu : sortEntries){  
            System.out.println("score:" + stu.getScore() + ":age" + stu.getAge());  
        }  
        
	}
	
	
	/**
	 5、list 去重
	 */
	@Test
	public void deleteSim(){
		
		deleteSimSet();
         
		delteSimIfContain();
		
		delteSimAddAllSet();
	}
	
	/**
	 1、set集合去重，不打乱顺序
	 */
	public void deleteSimSet(){
		
		System.out.println("1、set集合去重，不打乱顺序");
		 List<String> list  =   new  ArrayList<String>(); 
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aba");
        list.add("aaa");

        Set set = new  HashSet(); 
        List newList = new  ArrayList(); 
        for (String cd:list) {
           if(set.add(cd)){
               newList.add(cd);
           }
       }
        System.out.println( "去重后的集合： " + newList); 
	}
	
	 /**
	   2、遍历后判断赋给另一个list集合
	 */
	public void delteSimIfContain(){
      System.out.println("2、遍历后判断赋给另一个list集合");
      List<String> list  =   new  ArrayList<String>(); 
      list.add("aaa");
      list.add("bbb");
      list.add("aaa");
      list.add("aba");
      list.add("aaa");

      List<String> newList = new  ArrayList<String>(); 
      for (String cd:list) {
         if(!newList.contains(cd)){
             newList.add(cd);
         }
     }
      System.out.println( "去重后的集合： " + newList); 
	}
	
	/**
	3、set.addAll(); 
	   list.add(Set)
	 */
	public void delteSimAddAllSet(){
	      System.out.println("2、遍历后判断赋给另一个list集合");

		  List<String> list  =   new  ArrayList<String>(); 
	         list.add("aaa");
	         list.add("bbb");
	         list.add("aaa");
	         list.add("aba");
	         list.add("aaa");

	        Set set = new  HashSet(); 
	         List newList = new  ArrayList(); 
	         set.addAll(list);
	         newList.addAll(set);

	         System.out.println( "去重后的集合： " + newList); 
	}
	
	
	
	
	/**
	 * 
	6、清除list集合 list.clear();
	 */
	@Test
	public void clear(){
	      List<String> list  =   new  ArrayList<String>(); 
	      list.add("aaa");
	      list.add("bbb");
	      list.add("aaa");
	      list.add("aba");
	      list.add("aaa");

	      
	      list.clear();
	
	      System.out.println( "list.clear list大小 " + list.size()); 
		}
	
	/**
	 * 
	7、list 并集addAll，交集retainAll，差集removeAll
	 */
	@Test
	public void retainAllAndremoveAll(){
		
		java.util.List<Integer> list = new ArrayList<Integer>();
		java.util.List<Integer> list1 = new ArrayList<Integer>();
		list.add(1);  list.add(2); list.add(3); list.add(1);

		list1.add(2); list1.add(3); list1.add(4);
		
		//list和list1的并集：
	//	list.addAll(list1); //1 2 3 2 3 4 
		
		//list和list1的交集：
	//	list.retainAll(list1); // 2 3  
		//list和list1的差集：
		list.removeAll(list1);  //1

		for (Integer integer : list) {
			System.out.println(integer);
		}

	}
	
	/**
	 8、list set方法根据索引插入并且替换数据
	 */
	
	@Test
	public void setInsert(){
		String a="A",b="B",c="C",d="D",e="E";
		List<String>list=new ArrayList<>();
		list.add(a);
		list.add(e);
		list.add(d);
		Iterator<String>first=list.iterator();
		System.out.printf("修改前集合中的元素是：");
		while(first.hasNext()){
			System.out.print(first.next()+"    ");
		}

		System.out.println();
	    String temp=	list.set(1, b); //直接替换了上面的索引为1的元素2,并将原来位置上的数据返回
		System.out.println(temp); //E
		System.out.printf("set修改集合后的元素是：");
		Iterator second=list.iterator();
		while(second.hasNext()){
			System.out.print(second.next()+"    ");
		}


		System.out.println();
		list.add(2,c);//在索引为2的位置插入了元素c，然后向后移动一位
		Iterator second2=list.iterator();
		System.out.printf("修改集合后的元素是：");
		while(second2.hasNext()){
			System.out.print(second2.next()+"    ");
		}

	}
	
	@Test
	public void collection(){
//		Collection
//		List<E>
	}

	/**
	 * 这种是错误的
	 */
	@Test
	public void testRemoveAll(){
		PersonRemove personRemove1 = new PersonRemove("1","a");
		PersonRemove personRemove2 = new PersonRemove("2","a");
		PersonRemove personRemove3 = new PersonRemove("3","a");
		PersonRemove personRemoveNew1 =  new PersonRemove("1","a");
		PersonRemove personRemoveNew2 =  new PersonRemove("2","a");
		PersonRemove personRemoveNew3 =  new PersonRemove("3","a");

		PersonRemove personRemoveNew4 =  new PersonRemove("4","a");
		PersonRemove personRemoveNew5 =  new PersonRemove("5","a");


		List<PersonRemove> personRemovesFirst = new ArrayList<>();
		personRemovesFirst.add(personRemove1);
		personRemovesFirst.add(personRemove2);
		personRemovesFirst.add(personRemove3);

		List<PersonRemove> personRemovesLast = new ArrayList<>();
		personRemovesLast.add(personRemoveNew1);
		personRemovesLast.add(personRemoveNew2);
		personRemovesLast.add(personRemoveNew3);
		personRemovesLast.add(personRemoveNew4);
		personRemovesLast.add(personRemoveNew5);

		personRemovesLast.remove(personRemovesFirst);
		for (PersonRemove personRemove :personRemovesLast){
			System.out.println(personRemove.getId());
		}

	}

	@Test
	public void testRemoveAllSuccess(){
		PersonRemove personRemove1 = new PersonRemove("1","a");
		PersonRemove personRemove2 = new PersonRemove("2","a");
		PersonRemove personRemove3 = new PersonRemove("3","a");
		PersonRemove personRemoveNew1 =  new PersonRemove("1","a");
		PersonRemove personRemoveNew2 =  new PersonRemove("2","a");
		PersonRemove personRemoveNew3 =  new PersonRemove("3","a");

		PersonRemove personRemoveNew4 =  new PersonRemove("4","a");
		PersonRemove personRemoveNew5 =  new PersonRemove("5","a");


		List<PersonRemove> personRemovesFirst = new ArrayList<>();
		personRemovesFirst.add(personRemove1);
		personRemovesFirst.add(personRemove2);
		personRemovesFirst.add(personRemove3);

		List<PersonRemove> personRemovesLast = new ArrayList<>();
		personRemovesLast.add(personRemoveNew1);
		personRemovesLast.add(personRemoveNew2);
		personRemovesLast.add(personRemoveNew3);
		personRemovesLast.add(personRemoveNew4);
		personRemovesLast.add(personRemoveNew5);

		// personRemovesLast.remove(personRemovesFirst);

		List<PersonRemove> personRemoves = new ArrayList<>();
		personRemoves.addAll(personRemovesLast);

		for (PersonRemove personRemove :personRemoves){
			System.out.println(personRemove.getId());
		}
		System.out.println("----------");

		for(PersonRemove personRemoveL :personRemovesLast ){
			for (PersonRemove personRemoveF:personRemovesFirst){
				if(personRemoveF.getId().equals(personRemoveL.getId())){
					personRemoves.remove(personRemoveL);
				}
			}
		}
		for (PersonRemove personRemove :personRemoves){
			System.out.println(personRemove.getId());
		}

	}


	/**
	 * 取出集合 appsAppDataLast 减去 与  appsAppDataFirst 重复的对象
	 * @param appsAppDataLast
	 * @param appsAppDataFirst
	 * @return
	 */
//	public List<AppsAppData> getRemoveAll(List<AppsAppData> appsAppDataFirst,List<AppsAppData> appsAppDataLast){
//
//		List<AppsAppData> appsAppDatas = new ArrayList<>();
//		appsAppDatas.addAll(appsAppDataLast);
//
//		for(AppsAppData appsAppDataL :appsAppDataLast ){
//			for (AppsAppData appsAppDataF:appsAppDataFirst){
//				if(appsAppDataL.getTrackId().equals(appsAppDataF.getTrackId())){
//					appsAppDatas.remove(appsAppDataL);
//				}
//			}
//		}
//		return appsAppDatas;
//	}


	/**
	 * @Desc:  list 逆序 降序 增序
	 * @Date:  2018/8/9 上午11:43.
	 */

	@Test
	public void CollectionsReverse(){

		List<Long> ids  = new ArrayList<>();
		ids.add(1L);
		ids.add(3L);
		ids.add(4l);
		ids.add(8L);
		ids.add(5L);
		ids.add(10L);
		ids.add(10L);
		ids.add(19L);
		ids.add(18L);
		ids.add(14L);
		ids.add(12L);



		//逆序  [12, 14, 18, 19, 10, 10, 5, 8, 4, 3, 1]
		Collections.reverse(ids);
		System.out.println("逆序   "+ids);

		//默认升序 [1, 3, 4, 5, 8, 10, 10, 12, 14, 18, 19]
		Collections.sort(ids);
		System.out.println("默认升序"+ids);

		//降序Collections.reverseOrder() [19, 18, 14, 12, 10, 10, 8, 5, 4, 3, 1]
		Collections.sort(ids, Collections.reverseOrder());
		System.out.println("降序   "+ids);

	}


	@Test
	public void cover(){

		String array[] = {"1","2","3"};
        List<String> list ;
        String str ;
		//1、数组转化为集合
		 list =  Arrays.stream(array).collect(Collectors.toList());
        //2、
		list =  Arrays.asList(array);

        //2、集合转换为数组
        array =  list.stream().toArray(String[]::new);
        //2、
        array =  list.toArray(new String[0]);

        //集合转化为逗号的字符串
        //1、
         str =    list.stream().collect(Collectors.joining(","));
        System.out.println(str);
        //2、
        str = StringUtils.join(list,"," );
        System.out.println(str);

        //1、数组转化为带逗号的字符串
        str = Arrays.stream(array).collect(Collectors.joining(","));
        System.out.println(str);

        //逗号字符串转化为数组
        array = str.split(",");
        //逗号字符串转化为集合
        list = Arrays.asList(str.split(",")) ;

	}


}
