package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;

public class MergeSorterTest {

    public static void main(String[] args) {

        MergeSorter m = new MergeSorter();
        Element[] test = new Element[5];
        test[0] = new Element(23,0);
        test[1] = new Element(44,0);
        test[2] = new Element(88,0);
        test[3] = new Element(35,0);
        test[4] = new Element(234,0);
        Print.print(test);
        System.out.println("排序后：");
        m.sort(test);
        Print.print(test);

    }
}
