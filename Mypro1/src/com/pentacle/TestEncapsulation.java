package com.pentacle;

/**
 * @Auther: Pentacle
 * @Date: 2019/9/8
 * @Description: com.pentacle
 * @Version: 1.0
 */
public class TestEncapsulation {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20); //测试封装，想要调用私有属性时需要使用set方法
        System.out.println(p.getAge());
    }
}
