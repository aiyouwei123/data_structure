package com.wjl.day01;

/**
 * ������һ�������洢�����Խṹ��Ԫ��������ͬ����С��ȣ������Ƕ�ά�ģ�ͨ��ʹ����������ֵ���������ǵ�Ԫ�أ�����ĳߴ粻�ܱ�
 * ������ŵ㣺
 *      1. ��ȡ�ٶȿ�
 * �����ȱ�㣺
 *      1. ���ȱ���֪������ĳ���
 *      2. ����ɾ��Ԫ�غ���
 *      3. �ռ�ͨ���������Ƶ�
 *      4. ��Ҫ����������ڴ��
 *      5. ����ɾ��Ԫ�ص�Ч�ʺܵ�
 */

import java.util.Arrays;

public class Array {
    /**
     *
     * ϰ�⣺
     *  For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
     *
     * ˼·���Ƚ������е����з���������ȡ�����ηŵ������ǰ�У��ȵ���ֵ��ɺ��ٽ�����ĺ��и�ֵΪ0
     * @param arr
     */
    public static void moveZeroes(int[] arr){
        int index = 0;
        for(int num : arr){
            if(num !=0){
                arr[index++] = num; //++ i ���ȼӺ�ֵ��i ++ ���ȸ�ֵ��ӣ�
            }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }


    /**
     *
     * �ı�����ά�ȣ�
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
        // ��ȡ���ݵ�Ԫ�ظ���
        int m = arr.length;
        int n = arr[0].length;
        // ���������������ݸ�������ȣ��޷�����ת��
        if(m * n != r * c ){
            return arr;
        }
        // ������Ҫת��������
        int[][] reshapedNums = new int[r][c];
        int index = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<r; j++){
                //ѭ�����и�ֵ
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
    }
}
