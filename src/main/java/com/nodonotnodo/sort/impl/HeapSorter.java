package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;
import com.nodonotnodo.sort.Sorter;

/**
 * 堆排序
 * <p>
 * Author: nodonotnodo
 * Created: 2018/10/13
 */
public class HeapSorter implements Sorter {

    @Override
    public void sort(Element[] elements) {
        //升序所以建大堆
        int size = elements.length;
        while(size>0){
            //建大堆
            for(int i = size/2-1; i>=0; i--){
                int root = i;
                while(root*2+1<size){
                    int left = root*2+1;
                    int maxChild = left;
                    if(root*2+2<=size-1 && elements[root*2+2].compareTo(elements[root*2+1])>0){
                        maxChild = root*2+2;
                    }
                    if(elements[maxChild].compareTo(elements[root])>0){
                        Element tmp = elements[maxChild];
                        elements[maxChild] = elements[root];
                        elements[root] = tmp;
                        root = maxChild;
                        continue;
                    }
                    break;
                }
            }
            //将大堆的堆顶元素删除
            Element tmp = elements[0];
            elements[0] = elements[size-1];
            elements[size-1] = tmp;
            size--;
        }
    }

//    public static void print(Element[] elements){
//        for(Element v:elements){
//            System.out.println("key:"+v.getKey()+"\tdata:"+v.getData());
//        }
//    }
//
//    public static void main(String[] args) {
//        HeapSorter h = new HeapSorter();
//        Element[] test= new Element[8];
//        test[0] = new Element(23,0);
//        test[1] = new Element(34,0);
//        test[2] = new Element(64,0);
//        test[3] = new Element(12,0);
//        test[4] = new Element(9,0);
//        test[5] = new Element(9,0);
//        test[6] = new Element(0,0);
//        test[7] = new Element(-1,0);
//        print(test);
//        System.out.println("堆排序后：");
//        h.sort(test);
//        print(test);
//    }



}
