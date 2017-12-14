package com.hlj.NestedClasses;
/** 

	�ڲ���ʵ�ֶ�̳�
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
	 * �ڲ��� test1
	 */
    private class test1 extends Example1
    {
    	  public int thisTest(){
    	    	return 1;
    	    }
    	 /**
    	  * �ڲ��� this��ʹ�� 
    	  * �ڲ���ʹ��this��ʹ�õ��ڲ����࣬
    	  * ���ʹ���ⲿ���࣬�����ֱ��ʹ���ⲿ����.this.����
    	  */
        public String name()
        {
        	System.out.println(DjcTest.this.thisTest()); 
        	System.out.println(this.thisTest()); 
            return super.name();
        }


    }
    /**
	 * �ڲ��� test2
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
        System.out.println("����:" + mi.name());
        System.out.println("����:" + mi.age());
    }
}

