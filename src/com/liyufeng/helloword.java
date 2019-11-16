package com.liyufeng;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * 这是一个文档注释
 *
 *
 *
 */
public class helloword {

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /*
        这是一个加法
        是啊啊
        啊啊啊
         */
    private String name;

    public helloword() {
    }

    public static int plus(int x, int y){
        return x+y;//单行注释
    }

    public static void main(String[] args) {

        getList();getList();getList();getList();


        System.out.println(plus(5,3));
    }

    public static void getList() {
        System.out.println(plus(5,3));


        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        for (String ls :list) {

        }
    }
}
