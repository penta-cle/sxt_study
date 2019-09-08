package com.pentacle;

import java.util.Objects;
import java.util.SplittableRandom;

/**
 * @Auther: Pentacle
 * @Date: 2019/9/8
 * @Description: com.pentacle
 * @Version: 1.0
 */

/**
 * equals方法的重写
 */
public class TestEquals {
    public static void main(String[] args) {
        Object obj;
        String str;

        User u1 = new User(1000,"pentacle","123456");
        User u2 = new User(1000,"Twinkle","123456");

        System.out.println(u1==u2); //false
        System.out.println(u1.equals(u2)); //true

        String str1 = new String("pentacle");
        String str2 = new String("pentacle");

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true

    }
}

class User {
    int id;
    String name;
    String pwd;

    public User(int id, String name, String pwd) {
        super();
        this.id = id;
        this.name = name;
        this.pwd = pwd;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return id == user.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}