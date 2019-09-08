package com.pentacle;

/**
 * @Auther: Pentacle
 * @Date: 2019/9/6
 * @Description: com.pentacle
 * @Version: 1.0
 */

/**
 * 测试 if else语句
 */
public class TestIfElse {
    public static void main(String[] args) {
        //产生一个（0.0,4.0）区间的随机数，根据半径求周长和面积
        double r = 4 * Math.random();
        //Math.pow(r,2)求半径的平方
        double area = Math.PI * Math.pow(r, 2);
        double circle = 2 * Math.PI * r;
        System.out.println("半径等于：" + r);
        System.out.println("面积等于：" + area);
        System.out.println("周长等于：" + circle);
//如果面积大于周长则输出
        if(area > circle) {
            System.out.println("面积大于周长");
        }else {
            System.out.println("周长大于面积");
        }
    }

}
