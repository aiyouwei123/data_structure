package com.wjl.arraystudy;

public class ArrayStudy02 {
    /**
     * ����һ�����������飬 ��������������� 1 �ĸ�����
     * ���룺[1,1,0,1,1,1]
     * �����3
     * ���ͣ���ͷ����λ��������λ�������� 1 ������������� 1 �ĸ����� 3.
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
