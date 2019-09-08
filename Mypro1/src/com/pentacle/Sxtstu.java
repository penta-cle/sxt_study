package com.pentacle;

/**
 * @Auther: Pentacle
 * @Date: 2019/9/7
 * @Description: com.pentacle
 * @Version: 1.0
 */
class Computer {
    String brand; //电脑品牌
}

public class Sxtstu {
    int id;
    String sname;
    int age;
    Computer comp;
    void  study(){
        System.out.println("我正在学习，使用电脑："+comp.brand);
    }
    Sxtstu(){

    }

    public static void main(String[] args) {
        Sxtstu stu1 = new Sxtstu();
        stu1.sname = "张三";
        Computer comp1 = new Computer();
        comp1.brand = "Lenovo";
        stu1.comp = comp1;
        stu1.study();
    }
}
