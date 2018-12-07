package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;
import com.nodonotnodo.sort.Sorter;

/**
 * 选择排序
 * <p>
 * Author: nodonotnodo
 * Created: 2018/10/13
 */
public class SelectSorter implements Sorter {
    
    @Override
    public void sort(Element[] elements) {
        if(elements.length == 1){
            return;
        }
        int left = 0;
        int right = elements.length-1;
        while(left<right){
            //选出数组中最大值与最小值下标
            int max = left+1,min = left;
            for(int i = left; i<=right; i++){
                if(elements[i].compareTo(elements[max])>0){
                    max = i;
                }
                if(elements[i].compareTo(elements[min])<0){
                    min = i;
                }
            }
            //将最大值与最小值放到正确位置
            Element tmp = elements[max];
            elements[max] = elements[right];
            elements[right] = tmp;
            //防止最小值下标被修改
            if(min == right){
                min = max;
            }
            tmp = elements[min];
            elements[min] = elements[left];
            elements[left] = tmp;
            left++;
            right--;
        }
    }
}
