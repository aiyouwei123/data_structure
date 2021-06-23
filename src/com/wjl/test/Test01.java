package com.wjl.test;

import com.wjl.arraystudy.ArrayStudy;
import org.junit.Test;

public class Test01 {

    ArrayStudy arrayStudy = new ArrayStudy();

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
}
