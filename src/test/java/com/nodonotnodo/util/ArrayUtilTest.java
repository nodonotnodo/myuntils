package com.nodonotnodo.util;

import java.util.Iterator;
import java.util.Map;

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
//        myPrint(addAll(null));
    }


    /*
     * 生成一个从0开始的数字列表<br>
     *
     * @param //excludedEnd 结束的数字（不包含）
     * @return 数字列表
     */
    public static void rangeTest(){
//        range(int excludedEnd)
        myPrint(range(0));
        myPrint(range(5));
//        myPrint(range(257));
//        myPrint(range(300));

//        range(int begin, int last)
        myPrint(range(1,1));
        myPrint(range(1,5));
        myPrint(range(1,-4));

//        range(int begin, int last, int step)
        myPrint(range(1,12,3));
        myPrint(range(1,3,3));
        myPrint(range(5,-5,3));
        myPrint(range(5,-4,3));
        myPrint(range(-1,-7,3));
    }

    /*
     * 拆分byte数组为几个等份（最后一份可能小于len）
     *
     * @param array 数组
     * @param len   每个小节的长度
     * @return 拆分后的数组
     */
    public static void splitTest(){
        byte[] bytes = new byte[30];
        for(byte b=0; b<30; b++){
            bytes[b] = b;
        }
        myPrint(split(bytes,5));
    }

    /*
     * 映射键值（参考Python的zip()函数）<br>
     * 例如：<br>
     * keys = [a,b,c,d]<br>
     * values = [1,2,3,4]<br>
     * 则得到的Map是 {a=1, b=2, c=3, d=4}<br>
     * 如果两个数组长度不同，则只对应最短部分
     *
     * @param <K>     Key类型
     * @param <V>     Value类型
     * @param keys    键列表
     * @param values  值列表
     * @param isOrder 是否有序
     * @return Map
     */
    public static void zipTest(){
        String[] strings = new String[]{"第一个","第二个","第三个"};
        Integer[] integers = new Integer[]{1,2,3,4,5};
        Map<String, Integer> result1 = zip(strings, integers,false);
        myPrint(result1);
        Map<String, Integer> result2 = zip(strings, integers,false);
        myPrint(result2);
        Integer[] integers1 = null;
        Map<String, Integer> result3 = zip(strings, integers1,false);
        myPrint(result3);
        Map<String, Integer> result4 = zip(strings, integers1,false);
        myPrint(result4);
        Integer[] integers2 = new Integer[]{};
        Map<String, Integer> result5 = zip(strings, integers2,false);
        myPrint(result5);
        Map<String, Integer> result6 = zip(strings, integers2,false);
        myPrint(result6);
    }

    /*
     * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param <T>   数组类型
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static void indexOfTest(){
        String[] strings1 = null;
        System.out.println(indexOf(strings1,"a"));
        String[] strings2 = new String[]{"A","B","C","D"};
        System.out.println(indexOf(strings2,"A"));
        System.out.println(indexOf(strings2,"D"));
        System.out.println(indexOf(strings2,"C"));
        System.out.println(indexOf(strings2,"a"));
    }

    /*
     * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param <T>   数组类型
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    //indexOfTest();

    /*
     * 返回数组中指定元素所在位置，忽略大小写，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static void indexOfIgnoreCaseText(){
        CharSequence[] charSequences1 = null;
        System.out.println(indexOfIgnoreCase(charSequences1,"c"));
        CharSequence[] charSequences2 = new CharSequence[]{"A","B","C","D"};
        System.out.println(indexOfIgnoreCase(charSequences2,"A"));
        System.out.println(indexOfIgnoreCase(charSequences2,"D"));
        System.out.println(indexOfIgnoreCase(charSequences2,"C"));
        System.out.println(indexOfIgnoreCase(charSequences2,"a"));
        System.out.println(indexOfIgnoreCase(charSequences2,"v"));
    }

    /*
     * 返回数组中指定元素所在位置，忽略大小写，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    //indexOfIgnoreCaseText();

    /*
     * 返回数组中指定元素所在最后的位置，未找到返回{@link #INDEX_NOT_FOUND}
     *
     * @param <T>   数组类型
     * @param array 数组
     * @param value 被检查的元素
     * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
     */
    public static void lastIndexOfTest(){
        String[] strings1 = null;
        System.out.println(indexOf(strings1,"a"));
        String[] strings2 = new String[]{"A","B","C","A","F","C","D"};
        System.out.println(lastIndexOf(strings2,"A"));
        System.out.println(lastIndexOf(strings2,"D"));
        System.out.println(lastIndexOf(strings2,"C"));
        System.out.println(lastIndexOf(strings2,"a"));
    }

    /*
     * 数组中是否包含元素
     *
     * @param <T>   数组元素类型
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static void containsTest(){
        Integer[] integers1 = null;
        System.out.println(contains(integers1,3));
        Integer[] integers2 = new Integer[]{1,2,3,4,5,6};
        System.out.println(contains(integers2,null));
        System.out.println(contains(integers2,1));
        System.out.println(contains(integers2,6));
        System.out.println(contains(integers2,3));
        System.out.println(contains(integers2,8));
        String[] strings = new String[]{"A","B","C","D","E"};
        System.out.println(contains(strings,null));
        System.out.println(contains(strings,"A"));
        System.out.println(contains(strings,"E"));
        System.out.println(contains(strings,"C"));
        System.out.println(contains(strings,"a"));
    }

    /*
     * 数组中是否包含元素，忽略大小写
     *
     * @param array 数组
     * @param value 被检查的元素
     * @return 是否包含
     */
    public static void containsIgnoreCaseTest(){
        CharSequence[] charSequences1 = null;
        System.out.println(containsIgnoreCase(charSequences1,"A"));
        CharSequence[] charSequences2 = new CharSequence[]{"Hello","new","day"};
        System.out.println(containsIgnoreCase(charSequences2,null));
        System.out.println(containsIgnoreCase(charSequences2,"HELLO"));
        System.out.println(containsIgnoreCase(charSequences2,"heLLO"));
        System.out.println(containsIgnoreCase(charSequences2,"DaY"));
        System.out.println(containsIgnoreCase(charSequences2,"DaY1"));
    }

    /*
     * 获取数组对象中指定index的值，支持负数，例如-1表示倒数第一个值
     *
     * @param <T>   数组元素类型
     * @param array 数组对象
     * @param index 下标，支持负数
     * @return 值
     */
    public static void getTest(){
        String[] strings1 = null;
        System.out.println(get(strings1,3)+"");
        Character[] characters = new Character[]{'s','r','q','g','v','b','x'};
        System.out.println(get(characters,0)+"");
        System.out.println(get(characters,6)+"");
        System.out.println(get(characters,-1)+"");
        System.out.println(get(characters,-7)+"");
        System.out.println(get(characters,8)+"");
        System.out.println(get(characters,-8)+"");
    }

    /*
     * 获取数组中指定多个下标元素值，组成新数组
     *
     * @param <T>     数组元素类型
     * @param array   数组
     * @param indexes 下标列表
     * @return 结果
     */
    public static void getAnyTest(){
        String[] strings1 = null;
        myPrint1(getAny(strings1,1,2,3));
        String[] strings2 = new String[]{"Hello","New","Day","c","ds","java"};
        myPrint1(getAny(strings2));
        myPrint1(getAny(strings2,1,2,3));
        myPrint1(getAny(strings2,1,2,3,10));
    }

    /*
     * 获取子数组
     *
     * @param array 数组
     * @param start 开始位置（包括）
     * @param end   结束位置（不包括）
     * @return 新的数组
     */
    public static void subTest(){
        Integer[] integers1 = null;
        myPrint(sub(integers1,0,1));
        Integer[] integers2 = new Integer[]{1,2,3,4,5,6,7};
        myPrint(sub(integers2,-1,3));
        myPrint(sub(integers2,0,9));
        myPrint(sub(integers2,3,3));
        myPrint(sub(integers2,2,5));

        myPrint(sub(integers2,2,6,2));
        myPrint(sub(integers2,2,6,9));
    }

    //打印Map
    public static <K,V>void myPrint(Map<K,V> map){
        if(map == null){
            System.out.println("参数为空");
            return;
        }
        if(map.size() == 0){
            System.out.println("map中无内容");
            return;
        }
        System.out.println("结果为：");
        for(Map.Entry<K,V> entry : map.entrySet()){
            System.out.println("key："+entry.getKey()+"\t\tvalue:"+entry.getValue());
        }
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

    public static void myPrint(int[] array){
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
            if(0 == i%30){
                System.out.println();
            }
            System.out.print(array[i]+", ");
        }
    }

    public static void myPrint(byte[][] array){
        if(array == null){
            System.out.println("输入的参数为空");
            return;
        }
        System.out.print("数组内容为：\n");
        for(int i = 0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(j == array[0].length-1){
                    System.out.print(array[i][j]+"\n");
                }else{
                    System.out.print(array[i][j]+" , ");
                }
            }
        }
    }

    public static void myPrint1(String[] array){
        if(array == null){
            System.out.println("输入参数为空");
            return;
        }
        System.out.println("数组内容为:");
        for(int i = 0; i < array.length; i++){
            if(i == array.length-1){
                System.out.println(array[i]);
            }else{
                System.out.print(array[i] + ",  ");
            }
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
        //test10();

        /*
         * 生成一个从0开始的数字列表<br>
         *
         * @param excludedEnd 结束的数字（不包含）
         * @return 数字列表
         */
        //rangeTest();

        /*
         * 拆分byte数组为几个等份（最后一份可能小于len）
         *
         * @param array 数组
         * @param len   每个小节的长度
         * @return 拆分后的数组
         */
        //splitTest();

        /*
         * 映射键值（参考Python的zip()函数）<br>
         * 例如：<br>
         * keys = [a,b,c,d]<br>
         * values = [1,2,3,4]<br>
         * 则得到的Map是 {a=1, b=2, c=3, d=4}<br>
         * 如果两个数组长度不同，则只对应最短部分
         *
         * @param <K>     Key类型
         * @param <V>     Value类型
         * @param keys    键列表
         * @param values  值列表
         * @param isOrder 是否有序
         * @return Map
         */
        //zipTest();

        /*
         * 返回数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
         *
         * @param <T>   数组类型
         * @param array 数组
         * @param value 被检查的元素
         * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
         */
        //indexOfTest();

        /*
         * 返回数组中指定元素所在位置，忽略大小写，未找到返回{@link #INDEX_NOT_FOUND}
         *
         * @param array 数组
         * @param value 被检查的元素
         * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
         */
        //indexOfIgnoreCaseText();

        /*
         * 返回数组中指定元素所在最后的位置，未找到返回{@link #INDEX_NOT_FOUND}
         *
         * @param <T>   数组类型
         * @param array 数组
         * @param value 被检查的元素
         * @return 数组中指定元素所在位置，未找到返回{@link #INDEX_NOT_FOUND}
         */
        //lastIndexOfTest();

        /*
         * 数组中是否包含元素
         *
         * @param <T>   数组元素类型
         * @param array 数组
         * @param value 被检查的元素
         * @return 是否包含
         */
        //containsTest();

        /*
         * 数组中是否包含元素，忽略大小写
         *
         * @param array 数组
         * @param value 被检查的元素
         * @return 是否包含
         */
        //containsIgnoreCaseTest();

        /*
         * 获取数组对象中指定index的值，支持负数，例如-1表示倒数第一个值
         *
         * @param <T>   数组元素类型
         * @param array 数组对象
         * @param index 下标，支持负数
         * @return 值
         */
        //getTest();

        /*
         * 获取数组中指定多个下标元素值，组成新数组
         *
         * @param <T>     数组元素类型
         * @param array   数组
         * @param indexes 下标列表
         * @return 结果
         */
        //getAnyTest();

        /*
         * 获取子数组
         *
         * @param array 数组
         * @param start 开始位置（包括）
         * @param end   结束位置（不包括）
         * @return 新的数组
         */
        subTest();
    }
}
