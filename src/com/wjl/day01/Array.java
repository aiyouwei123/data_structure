package com.wjl.day01;

/**
 * 数组是一种连续存储的线性结构，元素类型相同，大小相等，数组是多维的，通过使用整型索引值来访问他们的元素，数组的尺寸不能变
 * 数组的优点：
 *      1. 存取速度快
 * 数组的缺点：
 *      1. 事先必须知道数组的长度
 *      2. 插入删除元素很慢
 *      3. 空间通常是有限制的
 *      4. 需要大块连续的内存块
 *      5. 插入删除元素的效率很低
 */

import java.util.Arrays;

public class Array {
    /**
     *
     * 习题：
     *  For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
     *
     * 思路：先将数组中的所有非零数据提取，依次放到数组的前列，等到赋值完成后，再将数组的后几列赋值为0
     * @param arr
     */
    public static void moveZeroes(int[] arr){
        int index = 0;
        for(int num : arr){
            if(num !=0){
                arr[index++] = num; //++ i 是先加后赋值；i ++ 是先赋值后加；
            }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }


    /**
     *
     * 改变矩阵的维度：
     * Input:
     * nums =
     * [[1,2],
     *  [3,4]]
     * r = 1, c = 4
     *
     * Output:
     * [[1,2,3,4]]
     *
     * Explanation:
     * The row-traversing of nums is [1,2,3,4]. The new reshaped matrix is a 1 * 4 matrix, fill it row by row by using the previous list.
     *
     *
     */
    public int[][] matrixReshape(int[][] arr,int r,int c){
        // 获取数据的元素个数
        int m = arr.length;
        int n = arr[0].length;
        // 如果两个数组的数据个数不相等，无法进行转换
        if(m * n != r * c ){
            return arr;
        }
        // 定义需要转换的数组
        int[][] reshapedNums = new int[r][c];
        int index = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<r; j++){
                //循环进行赋值
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
    }
}
