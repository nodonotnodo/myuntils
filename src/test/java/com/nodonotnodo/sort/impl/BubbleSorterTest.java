package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;

public class BubbleSorterTest {

    public static void main(String[] args) {

        BubbleSorterTest b = new BubbleSorterTest();
        Element[] test = new Element[5];
        test[0] = new Element(23,0);
        test[1] = new Element(44,0);
        test[2] = new Element(88,0);
        test[3] = new Element(35,0);
        test[4] = new Element(234,0);
        Print.print(test);
        System.out.println("排序后：");
        Print.print(test);
    }


}
