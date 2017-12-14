package com.hlj.NestedClasses;

/**
 想要理解static应用于内部类时的含义，你就必须记住，
 普通的内部类对象隐含地保存了一个引用，指向创建它的外围类对象。
 然而，当内部类是static的时，就不是这样了。
 */
public class StaticAndNoStaticClass{
    private static String staticExternalName = "external static   staticExternalName";
    private         String externaNamr = "external externaNamr";
    
    /**
     * 测试相同名字的内部类调用
     */
    private static String staticEqualName = "external static equalName";
    private        String equalName = "external  equalName";

    // 静态内部类可以用public,protected,private修饰
    static class StaticClass {
    	
        private static String staticInnerName = "staticInnerClass static staticInnerName";
       
        // 静态内部类中可以定义静态或者非静态的成员
        private        String innerName = "staticInnerClass innerName";

        private static String staticEqualName = "staticInnerClass static equalName";

        public void display() {
        	
            //报错  静态内部类不能访问外部类的非静态成员(包括非静态变量和非静态方法)
            // System.out.println(externaNamr);

            // 静态内部类只能访问外部类的静态成员(包括静态变量和静态方法)
            System.out.println("staticInnerClass " +staticExternalName + " 静态内部类只能访问外部类的静态成员(包括静态变量和静态方法)");

            // 静态内部类 可以访问本内部类静态成员
            System.out.println("staticInnerClass " + staticInnerName + "静态内部类可以访问本内部类静态成员。");
            // 静态内部类 访问本内部类非静态成员。
            System.out.println("staticInnerClass " + innerName + "静态内部类 访问本内部类非静态成员。");
            
            //先判断子类中有没有，没有的话就是访问父类中相同名字变量
            System.out.println("staticInnerClass "+staticEqualName + "判断子类中有没有，没有的话就是访问父类中相同名字变量" );
        }
    }
    
    /**
     * 非静态内部类
     *
     */
    public  class NoStaticClass{
		//报错 非静态内部类不能有静态的成员和方法
 		//private static String staticInnerName = "inner static staticInnerName";

        private  String innerName = "inner innerName";

        private  String equalName = "inner  equalName";

        public void display() {
        	
            //非  静态内部类能访问外部类的所有的方法和属性
            System.out.println("Inner " + staticExternalName + "非  静态内部类能访问外部类的所有的方法和属性,包括静态");

            System.out.println("Inner " + innerName);
            
            //先判断子类中有没有，没有的话就是访问父类中相同名字变量
            System.out.println("Inner "+equalName);
        }
	}
	
	/**
	 测试外部类调用内部类 私有方法和属性
	 */
    public void printInfo() {
    	StaticClass staticClass = new StaticClass();
    	staticClass.display();
    
        System.out.println(staticClass.innerName);// 可以访问内部类的私有成员
        System.out.println(staticClass.staticInnerName);// 外部类访问内部类的静态成员：内部类.静态成员
   
        System.out.println("***************");
        NoStaticClass noStaticClass = new NoStaticClass();
        noStaticClass.display();
        
    }

    public static void main(String[] args) {
        StaticAndNoStaticClass staticTest = new StaticAndNoStaticClass();
        staticTest.printInfo();
    }
}


