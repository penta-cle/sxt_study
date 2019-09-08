package com.pentacle;

/**
 * @Auther: Pentacle
 * @Date: 2019/9/6
 * @Description: com.pentacle
 * @Version: 1.0
 */

/**
 * 掷骰子游戏
 */
public class TestIf {
    public static void main(String[] args) {
//        double d = Math.random();
//        System.out.println(d);
//
//        int i = (int) (6 * Math.random() + 1);
//        System.out.println(i);
//        if (i <= 3) {
//            System.out.println("小");
//        }

        System.out.println("***************");
        int a = (int) (6 * Math.random() + 1);
        int b = (int) (6 * Math.random() + 1);
        int c = (int) (6 * Math.random() + 1);

        int count = a + b + c;
        System.out.println("得了"+count+"分");
        //如果骰子之和大于15，则手气不错
        if (count > 15) {
            System.out.println("今天手气不错！");
        }
        //如果骰子之和在10 15之间，则手气一般
        if (count > 10 && count < 15) {
            System.out.println("今天手气一般！");
        }

        //如果骰子之和小于10，则手气不太好
        if (count < 10) {
            System.out.println("今天手气不太好！");
        }
    }
}
