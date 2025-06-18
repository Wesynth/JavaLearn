package org.example.入门.变量_数据类型_运算符;

/**
 * 已知某班有男同学20位，女同学15位，20位男生平均分位87分，15位女生的平均分是85分
 * TODO 问全体同学平均分是多少？
 */
public class T6 {
    public static void main(String[] args) {
        double male=20;
        double female=15;
        double average_male=87;
        double average_female=85;
        double result=(male*average_male+female*average_female)/(male+female);
        String result_str=String.format("%.2f",result);
        System.out.println(result_str);
    }
}
