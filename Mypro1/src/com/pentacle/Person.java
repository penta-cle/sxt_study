package com.pentacle;

/**
 * @Auther: Pentacle
 * @Date: 2019/9/8
 * @Description: com.pentacle
 * @Version: 1.0
 */

/**
 * 测试封装
 * 外部调用私有属性的话需要使用set方法
 */
public class Person {
    private int id;
    private String name;
    private int age;
    private boolean man;

    public int getAge() {
        return age;
    }

    public void setAge(int age) { //外部调用私有属性的话需要使用set方法,对年龄的处理只能放到这个方法里处理
        if (age >= 1 && age <= 130) {
            this.age = age;
        } else {
            System.out.println("请输入正确的年龄");
        }
    }
}
