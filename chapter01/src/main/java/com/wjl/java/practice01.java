package com.wjl.java;

import org.junit.Test;

public class practice01 {
    /**
     * b
     * 197
     * e
     */
    @Test
    public void test01(){
        System.out.println('b');
        System.out.println('b'+'c');
        System.out.println((char)('a'+4));
    }

    @Test
    public void test02() {
        boolean[][] booleanArr = {{true, false, true,true}, {false, true, false}, {true, false, true}};
        System.out.print(" "); // 开头空一格
        for (int i = 0 ;i<booleanArr[0].length;i++){   // 此处 i 应该小于列数
            System.out.print(i +" ");
        }
        System.out.println();
        for(int i = 0 ;i<=booleanArr.length-1;i++){
            System.out.print(i);
            for (int j= 0; j<=booleanArr[i].length-1; j++){
                if(booleanArr[i][j]){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Test
    public void test3(){
        int[] a = new int[10];
        for (int i = 0 ; i < a.length; i ++){
            a[i] = 9 - i;   // a[0] = 9 , a[1]= 8, a[2] = 7, a[3] =  6 ,a[4] =  5, a[5] =  4,a[6] =  3,a[7] =  2, a[8] =  1 , a[9] =  0
            System.out.print(a[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i<a.length;i ++){
            a[i] = a[a[i]]; // 0 1 2 3 4 4 3 2 1 0
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i = 0; i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }

    @Test
    public void test4(){
        int m = 3;
        int n = 3;
        int[][] arrs = new int[m][n];

        for (int i = 0;i<arrs .length;i++){
            for(int j = 0 ; j<arrs[i].length ; j++){
                arrs[i][j] = j;
                System.out.print(arrs[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0;i<arrs .length;i++){
            for(int j = 0 ; j<arrs[i].length ; j++){
                System.out.print(arrs[j][i] + " ");
            }
            System.out.println();
        }

    }

    @Test
    public void test5(){

    }

    public int lg(int n){

        return 0;
    }
}
