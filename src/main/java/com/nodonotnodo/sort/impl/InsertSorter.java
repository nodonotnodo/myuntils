package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;
import com.nodonotnodo.sort.Sorter;

/**
 * 插入排序
 * <p>
 * Author: nodonotnodo
 * Created: 2018/10/13
 */
public class InsertSorter implements Sorter {
    
    @Override
    public void sort(Element[] elements) {
        int size = elements.length;
        if(size == 1){//数组长度为1,直接返回
            return;
        }
        int insert = 0;
        while(insert<size){
            //二分查找找到被插入的元素应该存放的位置
            int left = 0;
            int right = insert;
            while(left<right-1){
                int mid = left+(right-left)/2;
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
                left++;
            }
            Element insertDate = elements[insert];
            for(int i = insert; i>left; i--){
                elements[i] = elements[i-1];
            }
            elements[left] = insertDate;
            insert++;
        }
    }
}
