package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;
import com.nodonotnodo.sort.Sorter;

/**
 * 快速排序
 * <p>
 * Author: nodonotnodo
 * Created: 2018/10/13
 */
public class QuickSorter implements Sorter {
    @Override
    public void sort(Element[] elements) {
        if(elements == null || elements.length == 1){
            return;
        }
        realSort(elements,0, elements.length-1);
    }

    public void realSort(Element[] elements, int left, int right){
        if(left == right || left>right){
            return;
        }
        int mid = left + ((right-left)>>1);
        int base = midNum(elements, left, right, mid);
        if(right != base){
            Element tmp = elements[base];
            elements[base] = elements[right];
            elements[right] = tmp;
        }
        Element baseData = elements[right];
        int ileft = left;
        int iright = right;
        while (ileft < iright){
            while(elements[ileft].compareTo(baseData)<=0 && ileft<iright){
                ileft++;
            }
            elements[iright] = elements[ileft];
            if(ileft < iright){
                iright--;
            }
            while (elements[iright].compareTo(baseData)>0 && ileft<iright){
                iright--;
            }
            elements[ileft] = elements[iright];
            if(ileft < iright){
                ileft++;
            }
        }
        elements[ileft] = baseData;
        realSort(elements,left,ileft-1);
        realSort(elements,ileft+1,right);
    }

    //从三个坐标中选出一个数值为中间数的坐标
    public int midNum(Element[] elements, int left, int right, int mid){
        if(elements[left].compareTo(elements[right])>0){
            if(elements[right].compareTo(elements[mid])>0){
                return right;
            }else{
                if(elements[left].compareTo(elements[mid])>0){
                    return mid;
                }else {
                    return left;
                }
            }
        }else{
            if(elements[right].compareTo(elements[mid])>0){
                if(elements[left].compareTo(elements[mid])>0){
                    return left;
                }else{
                    return mid;
                }
            }else{
                return right;
            }
        }
    }
}
