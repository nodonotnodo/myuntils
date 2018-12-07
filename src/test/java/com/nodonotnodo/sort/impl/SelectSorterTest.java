package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;

public class SelectSorterTest {

    public static void main(String[] args) {

        SelectSorter s = new SelectSorter();
        Element[] test= new Element[8];
        test[0] = new Element(23,0);
        test[1] = new Element(34,0);
        test[2] = new Element(64,0);
        test[3] = new Element(12,0);
        test[4] = new Element(9,0);
        test[5] = new Element(9,0);
        test[6] = new Element(0,0);
        test[7] = new Element(-1,0);
        Print.print(test);
        System.out.println("堆排序后：");
        s.sort(test);
        Print.print(test);
    }


}
