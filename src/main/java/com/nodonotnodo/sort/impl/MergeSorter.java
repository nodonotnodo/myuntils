package com.nodonotnodo.sort.impl;

import com.nodonotnodo.sort.Element;
import com.nodonotnodo.sort.Sorter;

/**
 * 归并排序
 * <p>
 * Author: nodonotnodo
 * Created: 2018/10/13
 */
public class MergeSorter implements Sorter {
    
    @Override
    public void sort(Element[] elements) {
        if(elements == null || elements.length == 1){
            return;
        }
        realSort(elements,0,elements.length-1);
    }

    public void realSort(Element[] elements,int left,int right){
        if(right == left || left>right){
            return;
        }
        int mid = left+((right-left)>>1);
        realSort(elements,left,mid);
        realSort(elements,mid+1,right);
        fax(elements,left,right,mid);
    }

    public void fax(Element[] elements,int left,int right,int mid){
        Element[] tmp = new Element[right-left+1];
        int cur = 0;
        int ileft = left;
        int iright = mid+1;
        int flag = 1;//标志位，默认为左空间拷贝完成。
        while(cur <= tmp.length){
            if(ileft > mid){
                break;
            }
            if(iright > right){
                flag = 0;
                break;
            }
            if(elements[ileft].compareTo(elements[iright])>0){
                tmp[cur] = elements[iright];
                iright++;
            }else{
                tmp[cur] = elements[ileft];
                ileft++;
            }
            cur++;
        }
        if(flag == 1){//右空间未拷贝完成
            while(iright<=right){
                tmp[cur] = elements[iright];
                iright++;
                cur++;
            }
        }else{//左空间未拷贝完成
            while(ileft<=mid){
                tmp[cur] = elements[ileft];
                iright++;
                cur++;
            }
        }
        for(int i = 0; i<tmp.length; i++){
            elements[left++] = tmp[i];
        }
    }
}
