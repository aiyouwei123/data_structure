package com.wjl.arraystudy;

public class ArrayStudy02 {
    /**
     * 给定一个二进制数组， 计算其中最大连续 1 的个数。
     * 输入：[1,1,0,1,1,1]
     * 输出：3
     * 解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
     */

    public int findMaxConsecutiveOnes(int[] arr){
        int maxCount = 0, count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
