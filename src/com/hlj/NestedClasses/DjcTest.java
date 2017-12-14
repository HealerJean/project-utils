package com.hlj.NestedClasses;
/** 

	内部类实现多继承
 */
class Example1 {

    public String name()
    {
        return "liutao";
    }
}
class Example2 {

    public int age()
    {
        return 25;
    }
}



class DjcTest
{
	  public int thisTest(){
	    	return 2;
	    }

	/**
	 * 内部类 test1
	 */
    private class test1 extends Example1
    {
    	  public int thisTest(){
    	    	return 1;
    	    }
    	 /**
    	  * 内部类 this的使用 
    	  * 内部类使用this是使用的内部的类，
    	  * 如果使用外部的类，则可以直接使用外部类名.this.方法
    	  */
        public String name()
        {
        	System.out.println(DjcTest.this.thisTest()); 
        	System.out.println(this.thisTest()); 
            return super.name();
        }


    }
    /**
	 * 内部类 test2
	 */
    private class test2 extends Example2
    {
        public int age()
        {
            return super.age();
        }
    }
    
    
    public String name()
    {
        return new test1().name();
    }
    public int age()
    {
        return new test2().age();
    }
    public static void main(String args[])
    {
    	DjcTest mi = new DjcTest();
        System.out.println("姓名:" + mi.name());
        System.out.println("年龄:" + mi.age());
    }
}

