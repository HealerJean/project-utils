package com.hlj.thread.AtomicLong;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Description
 * @Author HealerJean
 * @Date 2018/4/2  обнГ4:28.
 */
 public class OriginMain  {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            Thread thread = new Thread(){
                @Override
                public void run() {
                        if(Counter.addOne() == 1000){
                            System.out.println("counter = 1000");
                        }

                }
            };
            thread.start();
        }
    }

}

/* class Counter {
    private static long counter = 0;
    public static  long addOne(){
        return ++counter;
    }
}*/

 class Counter {
    private static AtomicLong counter = new AtomicLong(0);


    public static long addOne() {
        return counter.incrementAndGet();
    }
}