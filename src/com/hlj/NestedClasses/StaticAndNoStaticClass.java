package com.hlj.NestedClasses;

/**
 ��Ҫ���staticӦ�����ڲ���ʱ�ĺ��壬��ͱ����ס��
 ��ͨ���ڲ�����������ر�����һ�����ã�ָ�򴴽�������Χ�����
 Ȼ�������ڲ�����static��ʱ���Ͳ��������ˡ�
 */
public class StaticAndNoStaticClass{
    private static String staticExternalName = "external static   staticExternalName";
    private         String externaNamr = "external externaNamr";
    
    /**
     * ������ͬ���ֵ��ڲ������
     */
    private static String staticEqualName = "external static equalName";
    private        String equalName = "external  equalName";

    // ��̬�ڲ��������public,protected,private����
    static class StaticClass {
    	
        private static String staticInnerName = "staticInnerClass static staticInnerName";
       
        // ��̬�ڲ����п��Զ��徲̬���߷Ǿ�̬�ĳ�Ա
        private        String innerName = "staticInnerClass innerName";

        private static String staticEqualName = "staticInnerClass static equalName";

        public void display() {
        	
            //����  ��̬�ڲ��಻�ܷ����ⲿ��ķǾ�̬��Ա(�����Ǿ�̬�����ͷǾ�̬����)
            // System.out.println(externaNamr);

            // ��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա(������̬�����;�̬����)
            System.out.println("staticInnerClass " +staticExternalName + " ��̬�ڲ���ֻ�ܷ����ⲿ��ľ�̬��Ա(������̬�����;�̬����)");

            // ��̬�ڲ��� ���Է��ʱ��ڲ��ྲ̬��Ա
            System.out.println("staticInnerClass " + staticInnerName + "��̬�ڲ�����Է��ʱ��ڲ��ྲ̬��Ա��");
            // ��̬�ڲ��� ���ʱ��ڲ���Ǿ�̬��Ա��
            System.out.println("staticInnerClass " + innerName + "��̬�ڲ��� ���ʱ��ڲ���Ǿ�̬��Ա��");
            
            //���ж���������û�У�û�еĻ����Ƿ��ʸ�������ͬ���ֱ���
            System.out.println("staticInnerClass "+staticEqualName + "�ж���������û�У�û�еĻ����Ƿ��ʸ�������ͬ���ֱ���" );
        }
    }
    
    /**
     * �Ǿ�̬�ڲ���
     *
     */
    public  class NoStaticClass{
		//���� �Ǿ�̬�ڲ��಻���о�̬�ĳ�Ա�ͷ���
 		//private static String staticInnerName = "inner static staticInnerName";

        private  String innerName = "inner innerName";

        private  String equalName = "inner  equalName";

        public void display() {
        	
            //��  ��̬�ڲ����ܷ����ⲿ������еķ���������
            System.out.println("Inner " + staticExternalName + "��  ��̬�ڲ����ܷ����ⲿ������еķ���������,������̬");

            System.out.println("Inner " + innerName);
            
            //���ж���������û�У�û�еĻ����Ƿ��ʸ�������ͬ���ֱ���
            System.out.println("Inner "+equalName);
        }
	}
	
	/**
	 �����ⲿ������ڲ��� ˽�з���������
	 */
    public void printInfo() {
    	StaticClass staticClass = new StaticClass();
    	staticClass.display();
    
        System.out.println(staticClass.innerName);// ���Է����ڲ����˽�г�Ա
        System.out.println(staticClass.staticInnerName);// �ⲿ������ڲ���ľ�̬��Ա���ڲ���.��̬��Ա
   
        System.out.println("***************");
        NoStaticClass noStaticClass = new NoStaticClass();
        noStaticClass.display();
        
    }

    public static void main(String[] args) {
        StaticAndNoStaticClass staticTest = new StaticAndNoStaticClass();
        staticTest.printInfo();
    }
}


