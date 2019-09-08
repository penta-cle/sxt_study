package com.pentacle;

import java.util.*;

/**
 * @Auther: Pentacle
 * @Date: 2019/9/6
 * @Description: com.com.pentacle
 * @Version: 1.0
 */

/**
 * 测试Scanner打印输出
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = scanner.nextLine();
        System.out.println("请输入爱好：");
        String favor = scanner.nextLine();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();

        System.out.println("*************************");
        System.out.println(name);
        System.out.println(favor);
        System.out.println("来到地球的天数 " + age * 365);
        System.out.println("即将离开地球的天数 " + (72 - age) * 365);

    }
}
