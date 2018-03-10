package com.hlj.Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.hlj.arithmetic.killperson.Person;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��13�� ����4:43:59 
 * ��˵�� 
 */
public class ArraylistTest {

  
    /**
     * 2���趨arraylist����size
     * ArrayList��û��ֵʱ����sizeΪ0 
     * ����size��ʼ��Ϊ�� ��ʵ��û������ģ�ֻ�ᶯ̬�ĵĵõ����Ĵ�С
     */
	@Test
    public  void NewArraylist(){
    	
    	List<String> strs = new ArrayList<String>(2);
    	//����û��ֵ ��Ȼ֮��õ��� ��СΪ 0
    	System.out.println(strs.size());
    	
    	strs.add("��һ��size");
    	strs.add("��һ��size");
    	strs.add("��һ��size");
    	strs.add("��һ��size");
    	System.out.println(strs.size());

    	
    }
    
    /**
     * 1������remove���� remove(object ������ index)
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
        System.out.println("remove 0 Ҳ����ȥ���� String two");
        Iterator it2 = empList.iterator();  
        while(it2.hasNext()){  
            String emp = (String)it2.next();  
            System.out.println(emp.toString());    
        }

	}  
	
	/**
	3�� list ������˳��
	 */
	@Test
	public void listHaveAddSort(){
		List<Person> persons= new ArrayList<Person>();
		Person person = new Person(0, "HealerJean");
		Person person2 = new Person(0, "HealerJean");
		persons.add(0,person);
		persons.add(3,person2); //������Ϊû�� 2
	}
	
	
	/**
	 4��list ����
	 */
	@Test
	public void listSort(){
	/**
	 * 1��list �ڲ�Integer����
	 */
        System.out.println("1��list �ڲ�Integer����");
		List<Integer> nums = new ArrayList<Integer>();  
        nums.add(3);  
        nums.add(5);  
        nums.add(1);  
        nums.add(0);  
        System.out.println(nums);  
        Collections.sort(nums);  
        System.out.println(nums);  
        
    	/**
    	 * 2��list �ڲ�����
    	 */
    	System.out.println("2��list �ڲ�����");	   
        List<SortEntry> sortEntries = new ArrayList<SortEntry>();  
        sortEntries.add(new SortEntry(23, 100));  
        sortEntries.add(new SortEntry(27, 98));  
        sortEntries.add(new SortEntry(29, 99));  
        sortEntries.add(new SortEntry(29, 98));  
        sortEntries.add(new SortEntry(22, 89));  
        Collections.sort(sortEntries, new Comparator<SortEntry>() {  
  
            @Override  
            public int compare(SortEntry o1, SortEntry o2) {  
                int i = o1.getScore() - o2.getScore();  //�Ȱ�����������  
                if(i == 0){  
                    return o1.getAge() - o2.getAge();  //���������������÷�����������  
                }  
                return i;  
            }  
        });  
        for(SortEntry stu : sortEntries){  
            System.out.println("score:" + stu.getScore() + ":age" + stu.getAge());  
        }  
        
	}
	
	
	/**
	 5��list ȥ��
	 */
	@Test
	public void deleteSim(){
		
		deleteSimSet();
         
		delteSimIfContain();
		
		delteSimAddAllSet();
	}
	
	/**
	 1��set����ȥ�أ�������˳��
	 */
	public void deleteSimSet(){
		
		System.out.println("1��set����ȥ�أ�������˳��");
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
        System.out.println( "ȥ�غ�ļ��ϣ� " + newList); 
	}
	
	 /**
	   2���������жϸ�����һ��list����
	 */
	public void delteSimIfContain(){
      System.out.println("2���������жϸ�����һ��list����");
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
      System.out.println( "ȥ�غ�ļ��ϣ� " + newList); 
	}
	
	/**
	3��set.addAll(); 
	   list.add(Set)
	 */
	public void delteSimAddAllSet(){
	      System.out.println("2���������жϸ�����һ��list����");

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

	         System.out.println( "ȥ�غ�ļ��ϣ� " + newList); 
	}
	
	
	
	
	/**
	 * 
	6�����list���� list.clear();
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
	
	      System.out.println( "list.clear list��С " + list.size()); 
		}
	
	/**
	 * 
	7��list ����addAll������retainAll���removeAll
	 */
	@Test
	public void retainAllAndremoveAll(){
		
		java.util.List<Integer> list = new ArrayList<Integer>();
		java.util.List<Integer> list1 = new ArrayList<Integer>();
		list.add(1);  list.add(2); list.add(3);
		
		list1.add(2); list1.add(3); list1.add(4);
		
		//list��list1�Ĳ�����
	//	list.addAll(list1); //1 2 3 2 3 4 
		
		//list��list1�Ľ�����
	//	list.retainAll(list1); // 2 3  
		//list��list1�Ĳ��
		list.removeAll(list1);  //1

		for (Integer integer : list) {
			System.out.println(integer);
		}

	}
	
	/**
	 8��list set��������������������
	 */
	
	@Test
	public void setInsert(){
		
	    List<String> list  =   new  ArrayList<String>(); 
	      list.add("aaa");
	      list.add("bbb");
	      list.add("aaa");
	      list.add("aba");
	      list.add("aaa");

	     System.out.println("list.set ����ǰ"); 
	     for (String str : list) {
			System.out.println(str); 
		 }
	     
	     
	      list.set(1, "123");
		  System.out.println("list.set ����123��"); 
	      for (String str : list) {
			System.out.println(str); 
		 }

	}
	
	@Test
	public void collection(){
//		Collection
//		List<E>
	}

	/**
	 * �����Ǵ����
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
	 * ȡ������ appsAppDataLast ��ȥ ��  appsAppDataFirst �ظ��Ķ���
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

}
