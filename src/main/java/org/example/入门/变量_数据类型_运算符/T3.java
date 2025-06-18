package org.example.入门.变量_数据类型_运算符;

public class T3 {
    public static void main(String[] args) {
        //自增运算符
        int num1=1;
        System.out.println(++num1);
        int num2=1;
        System.out.println(num2++);
        /*
         ++在前面，是先参与运算，然后使用值
         ++加变量后面，则是先使用这个值，然后再进行自增
         */
    }
}
