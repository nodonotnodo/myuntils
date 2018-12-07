package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;

public class Print {

    public static void print(Element[] elements){
        for(Element v:elements){
            System.out.println("key:"+v.getKey()+"\tdata:"+v.getData());
        }
    }
}
