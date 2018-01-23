package com.hlj.contineAndBreak;

public class While {
    public static void main(String[] args) {
        int i= 0;
        int j = 0;
        while (i<6) {
            i++;
                if(i==4){
                    return; //结束全部的代码,不带返回值的return语句只能用于返回类型为void的函数。
                }

        }
        System.out.println("i="+i+" j="+j);
    }

    public String returnTest(){

      //报错  return ;
      return null;
    }
}
