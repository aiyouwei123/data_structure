package com.wjl.test;

import com.wjl.arraystudy.ArrayStudy01;
import com.wjl.arraystudy.ArrayStudy02;
import org.junit.Test;

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

}
