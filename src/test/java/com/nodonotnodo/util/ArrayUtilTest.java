package com.nodonotnodo.util;

import static com.nodonotnodo.util.ArrayUtil.*;

public class ArrayUtilTest {

    //判断对象为Object类的对象是否为空
    public static void test1(){
        Object obj1 = new int[0];
        System.out.println("判断对象Object obj1 = new int[0]是否为空:\t"+isEmpty(obj1));
        Object obj2 = new Integer[]{1,2};
        System.out.println("判断对象Object obj2 = new Integer[]{1,2}是否为空:\t"+isEmpty(obj2));
        Object obj3 = new String[]{"ad","ad"};
        System.out.println("判断对象Object obj3 = new String[]{\"ad\",\"ad\"}是否为空:\t"+isEmpty(obj3));
        Object obj4 = new boolean[]{true,true,false};
        System.out.println("判断对象Object obj4 = new boolean[]{true,true,false}是否为空:\t"+isEmpty(obj4));
        Object obj5 = new boolean[0];
        System.out.println("判断对象Object obj5 = new boolean[0]是否为空:\t"+isEmpty(obj5));
    }

    //判断数组中是否包含null元素
    public static void test2(){
        String[] str1 = new String[]{"ad",null};
        System.out.println("判断对象String[] str1 = new String[]{\"ad\",null}是否包含null元素:\t"+hasNull(str1));
        String[] str2 = null;
        System.out.println("判断对象String[] str2 = null是否包含null元素:\t"+hasNull(str2));
    }

    //返回数组中的第一个非空元素
    public static void test3(){
        String[] str1 = new String[]{null,"af",null};
        System.out.println("返回对象String[] str1 = new String[]{null,\"af\",null}中的第一个非空null元素:\t"+firstNonNull(str1));
        String[] str2 = null;
        System.out.println("返回对象String[] str1 = null中的第一个非空null元素:\t"+firstNonNull(str2));
        String[] str3 = new String[0];
        System.out.println("返回对象String[] str3 = new String[0]中的第一个非空null元素:\t"+firstNonNull(str3));
    }

    //创建一个空数组
    public static void test4(){
        String[] str1 = newArray(String.class,3);
        System.out.println("创建一个空数组String[] str1 = newArray(Integer.class,3)，它的长度为："+str1.length);
        Integer[] ints1 = newArray(Integer.class,0);
        System.out.println("创建一个空数组Integer[] ints1 = newArray(Integer.class,0)，它的长度为："+ints1.length);

        String[] str2 = newArray(3);
        System.out.println("创建一个空数组String[] str2 = newArray(3)，它的长度为："+str2.length);
        Integer[] ints2 = newArray(0);
        System.out.println("创建一个空数组Integer[] ints2 = newArray(0)，它的长度为："+ints2.length);
    }

    public static void main(String[] args) {

        //判断对象为Object类的对象是否为空
        //test1();

        //判断数组中是否包含null元素
        //test2();

        //返回数组中的第一个非空元素
        //test3();

        //创建一个空数组
        test4();
    }
}
