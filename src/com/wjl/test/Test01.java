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
    @Test
    public void test6() {
     /*   double a = 0.2;
        double b = 0.4;
        boolean result = doubleTest(a,b);
        System.out.println(result);*/
        forTest();
    }

    public void intTest(){
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

    public boolean doubleTest(double a,double b){
        if(0.0<a && a<1.0 && 0.0<b && b <1.0){
            return true;
        }
        return false;
    }

    public void forTest(){
        int f = 0;
        int g = 1;
        for(int i =0;i<=15 ;i++){
            System.out.println(f); // 0 1 1 2 3 5 8 13 21 34 55
            f = f+g; // 1 1 2 3 5 8 13 21 34 55 89
            g = f-g; // 0 1 1 2 3 5 8 13 21 34 55
        }
    }

    public static void main(String[] args) {
        double t = 9.0;
        while(Math.abs(t - 9.0/t)>.001){
            t = (9.0/t + t) / 2.0;
        }
        System.out.printf("%.5f\n",t);

        int sum = 0;
        for(int i = 1; i< 1000; i ++){
            for(int j = 0 ; j < i; j++){
                sum ++;
            }
        }
        System.out.println(sum); //


        int sum2 = 0;
        for(int i = 1; i<1000 ; i*=2){ // 1 2 4 8 16 32 64 128 256 512
            for(int j = 1 ; j <1000; j++){
                sum2 ++;
            }
        }
        System.out.println(sum2);  // 10 * 999
    }
}
