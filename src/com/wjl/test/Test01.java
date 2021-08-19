package com.wjl.test;

import com.wjl.arraystudy.ArrayStudy01;
import com.wjl.arraystudy.ArrayStudy02;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {

    ArrayStudy01 arrayStudy = new ArrayStudy01();

    ArrayStudy02 arrayStudy02 = new ArrayStudy02();

    @Test
    public void test(){
        int[][] arr = {{1,2},{3,4}};
        int[][] ints = arrayStudy.matrixReshape(arr, 1, 4);
        for(int[] arr1 : ints){
          for(int num : arr1){
              System.out.print(num);
          }
        }

    }

    @Test
    public void test2(){
       int[] arr ={1,1,0,1,1,1};
       int index = arrayStudy02.findMaxConsecutiveOnes(arr);
        System.out.println(index);
    }


    @Test
    public void test3(){
        System.out.println((0+15)/2);
        System.out.println(2.0e-6*100000000.1);

        System.out.println((1+2.236)/2);
        System.out.println(1+2+3+4.0);
        System.out.println(4.1>=4);
        System.out.println(1+2+"3");
    }

    public static void main(String[] args) {
        System.out.print("请输入三个整数：");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        if(i == j && j == k){
            System.out.println("equal");
        }else {
            System.out.println("noequal");
        }
    }


}
