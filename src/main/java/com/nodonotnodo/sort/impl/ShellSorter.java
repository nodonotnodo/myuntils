package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;
import com.nodonotnodo.sort.Sorter;

/**
 * 希尔排序
 * <p>
 * Author: nodonotnodo
 * Created: 2018/10/13
 */
public class ShellSorter implements Sorter {
    
    @Override
    public void sort(Element[] elements) {
        //TODO
        int size = elements.length;
        if(size == 1){//数组长度为1,直接返回
            return;
        }
        //预处理
        ready(elements,3);
        InsertSorter i = new InsertSorter();
        i.sort(elements);

    }

    //预处理，将原数据分为n组数据先进行插排
    public void ready(Element[] elements, int n){
        for(int i = 0; i<n; i++){
            int insert = 0+i;
            while(insert<elements.length){
                //二分查找找到被插入的元素应该存放的位置
                int left = 0+i;
                int right = insert;
                while(left<right-n){
                    int mid = left+(right/3-left/3)/2*3;
                    if(elements[insert].compareTo(elements[mid])>0){
                        left = mid;
                    }else if(elements[insert].compareTo(elements[mid])<0){
                        right = mid;
                    }else{
                        left = mid;
                    }
                }
                //进行插入
                if(elements[insert].compareTo(elements[left])>0){
                    left+=n;
                }
                Element insertDate = elements[insert];
                for(int j = insert; j>left; j-=n){
                    elements[j] = elements[j-n];
                }
                elements[left] = insertDate;
                insert+=n;
            }
        }
    }
}
