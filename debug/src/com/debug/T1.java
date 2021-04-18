package com.debug;

import java.util.ArrayList;

/**
 * @author monkeykingGWX
 * email 704835519@qq.com
 * created 2021-04-15 17:58
 */


public class T1 {

    public static void main(String[] args) {
        ArrayList<String> hobbys = new ArrayList<>();

        hobbys.add("动漫1");
        hobbys.add("动漫2");
        hobbys.add("动漫3");
        hobbys.add("动漫4");
        hobbys.add("动漫5");
        hobbys.add("动漫6");
        hobbys.add("动漫7");
        hobbys.add("动漫8");
        hobbys.add("动漫9");
        hobbys.add("动漫10");
        hobbys.add("动漫11");

        Object[] strs =hobbys.toArray();

        for (Object str : strs) {
            String hobby = (String) str;
            System.out.println(hobby);
        }
    }
}

class T2
{
    public static void main(String[] args) {
        String[] strs;
        String[] a = {};

        strs = a;
        strs[0] = "ee";
    }
}
