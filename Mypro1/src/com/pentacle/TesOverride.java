package com.pentacle;

/**
 * @Auther: Pentacle
 * @Date: 2019/9/8
 * @Description: com.pentacle
 * @Version: 1.0
 */

/**
 * 测试重新
 */
public class TesOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.run();
    }
}

class Vehicle {
    public void run() {
        System.out.println("跑..");
    }

    public void stop() {
        System.out.println("停止...");

    }
//    public Person whoIsPsg() {
//        return new Person();
//    }
}

class Horse extends Vehicle {
    public void run() {
        System.out.println("四蹄翻飞");
    }

//    public Person whoIsPsg() {
//        return new Person();
//    }
}

