package com.example.java_practice;

//A에 숫자 1, 2, .., K(1에서 K까지의 모든 숫자가 적어도 한 번)가 포함되어 있고 다른 숫자는 포함되어 있지 않은지 확인합니다.

public class Task2 {
    public boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;

        }
//        System.out.println(A[0]);
//        System.out.println(A[0]!=1);
//        System.out.println(A[n-1]);
//        System.out.println(A[n-1]!=K);

        if (A[0] != 1 || A[n-1] != K)
            return false;
        else
            return true;
    }
}
