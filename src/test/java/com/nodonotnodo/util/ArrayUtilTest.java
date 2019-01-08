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

        Object[] str2 = newArray(3);
        System.out.println("创建一个空数组String[] str2 = newArray(3)，它的长度为："+str2.length);
        Object[] ints2 = newArray(0);
        System.out.println("创建一个空数组Integer[] ints2 = newArray(0)，它的长度为："+ints2.length);
    }

    //获取数组对象的元素类型
    public static void test5(){
        String[] str1 = null;
        System.out.println("创建数组String[] str1 = null，它的元素类型为："+getComponentType(str1));
        String[] str2 = new String[]{"adf","dfd"};
        System.out.println("创建数组String[] str2 = new String[]{\"adf\",\"dfd\"}，它的元素类型为："+getComponentType(str2));
        int[] ints1 = new int[]{1,2};
        System.out.println("创建数组int[] ints1 = new int[]{1,2}，它的元素类型为："+getComponentType(ints1));
        int[] ints2 = new int[0];
        System.out.println("创建数组int[] ints2 = new int[0]，它的元素类型为："+getComponentType(ints1));
    }

    //根据数组元素类型，获取数组的类型
    public static void test6(){
        System.out.println("元素类型为Integer.class的数组，它的数组类型为："+getArrayType(Integer.class));
        System.out.println("元素类型为Boolean.class的数组，它的数组类型为："+getArrayType(Boolean.class));
        System.out.println("元素类型为String.class的数组，它的数组类型为："+getArrayType(String.class));
    }

    //强转数组类型<br>
    //强制转换的前提是数组元素类型可被强制转换<br>
    //强制转换后会生成一个新数组
    public static void test7(){
        Integer[] ints1 = new Integer[]{1,2,3};
        System.out.println(cast(Integer.class,ints1).toString());
        System.out.println(cast(Object.class,null));
        System.out.println(cast(Object.class,1));
    }

    //将新元素添加到已有数组中<br>
    //添加新元素会生成一个新的数组，不影响原数组
    public static void test8(){
        //appendsd()1
        Integer[] ints1 = null;
        //myPrint(append(ints1,2));
        Integer[] ints2 = new Integer[]{1,43,23};
        myPrint(append(ints2,2,3,4));

        //append()2
        Object ints3 = new Byte[]{1,43,23};
        //myPrint(append(ints2,));
    }

    //将新元素插入到到已有数组中的某个位置
    //添加新元素会生成一个新的数组，不影响原数组
    //如果插入位置为为负数，从原数组从后向前计数，若大于原数组长度，则空白处用null填充
    public static void test9(){
        Integer[] ints1 = new Integer[]{1,2,3,4};
        Integer[] ints1_1 = new Integer[]{7,8};
        myPrint((Object[]) insert(ints1,0,ints1_1));
        myPrint((Object[]) insert(ints1,2,ints1_1));
        myPrint((Object[]) insert(ints1,4,ints1_1));
        myPrint((Object[]) insert(ints1,6,ints1_1));
        myPrint((Object[]) insert(ints1,-2,ints1_1));
        myPrint((Object[]) insert(ints1,-4,ints1_1));
        myPrint((Object[]) insert(ints1,-6,ints1_1));
        Integer[] ints2 = new Integer[]{1,2,3,4,5,6,7};
        Integer[] ints2_1 = new Integer[]{8,9,10};
        myPrint((Object[]) insert(ints2,0,ints2_1));
        myPrint((Object[]) insert(ints2,2,ints2_1));
        myPrint((Object[]) insert(ints2,4,ints2_1));
        myPrint((Object[]) insert(ints2,6,ints2_1));
        myPrint((Object[]) insert(ints2,7,ints2_1));
        myPrint((Object[]) insert(ints2,13,ints2_1));
        myPrint((Object[]) insert(ints2,-2,ints2_1));
        myPrint((Object[]) insert(ints2,-4,ints2_1));
        myPrint((Object[]) insert(ints2,-6,ints2_1));
        myPrint((Object[]) insert(ints2,-7,ints2_1));
        myPrint((Object[]) insert(ints2,-13,ints2_1));
    }

    //将多个数组合并在一起<br>
    //忽略null的数组
    public static void test10(){
        Integer[] ints1 = new Integer[]{1,2,3,4};
        Integer[] ints2 = null;
        Integer[] ints3 = new Integer[]{5,6};
        myPrint(addAll(ints1,ints2,ints3));
        myPrint(addAll(null));
    }

    //打印数组
    public static void myPrint(Object[] array){
        if(array == null){
            System.out.println("输入的参数为空");
            return;
        }
        System.out.print("数组内容为：");
        for(int i = 0; i<array.length; i++){
            if(i == array.length-1){
                System.out.print(array[i]+"\n");
                return;
            }
            System.out.print(array[i]+", ");
        }
    }

    public static void main(String[] args) {

        //判断对象为Object类的对象是否为空
        //test1();

        //判断数组中是否包含null元素
        //test2();

        //返回数组中的第一个非空元素
        //test3();

        //创建一个空数组
        //test4();

        //获取数组对象的元素类型
        //test5();

        //根据数组元素类型，获取数组的类型
        //test6();

        //强转数组类型<br>
        //强制转换的前提是数组元素类型可被强制转换<br>
        //强制转换后会生成一个新数组
        //test7();

        //将新元素添加到已有数组中<br>
        //添加新元素会生成一个新的数组，不影响原数组
        //test8();

        //将新元素插入到到已有数组中的某个位置
        //添加新元素会生成一个新的数组，不影响原数组
        //如果插入位置为为负数，从原数组从后向前计数，若大于原数组长度，则空白处用null填充
        //test9();

        //将多个数组合并在一起<br>
        //忽略null的数组
        test10();
    }
}
