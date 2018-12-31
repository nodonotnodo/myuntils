package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;

public class ShellSorterTest {

    public static void main(String[] args) {

        ShellSorter s = new ShellSorter();
        Element[] test = new Element[7];
        test[0] = new Element(55,0);
        test[1] = new Element(44,0);
        test[2] = new Element(23,0);
        test[3] = new Element(35,0);
        test[4] = new Element(12,0);
        test[5] = new Element(29,0);
        test[6] = new Element(98,0);
        Print.print(test);
        System.out.println("排序后：");
        s.sort(test);
        Print.print(test);
    }
}
