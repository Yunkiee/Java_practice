package com.example.java_practice;

// 원소 중 1 차이나는 원소가 있을때 true

import java.util.Arrays;

public class Task4 {
    public boolean solution(int[] A) {
        Arrays.sort(A);
        for(int i=0; i<A.length-1; i++) {
            if (A[i+1] - A[i] == 1) {
                return true;
            }
        }
        return false;
    }
}
