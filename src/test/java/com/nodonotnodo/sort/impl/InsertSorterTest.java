package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;

public class InsertSorterTest {

    public static void main(String[] args) {
        InsertSorter i = new InsertSorter();
        Element[] test = new Element[5];
        test[0] = new Element(55,0);
        test[1] = new Element(44,0);
        test[2] = new Element(23,0);
        test[3] = new Element(35,0);
        test[4] = new Element(12,0);
        Print.print(test);
        System.out.println("排序后：");
        i.sort(test);
        Print.print(test);
    }
}
