package com.example.java_practice;

// 크기가 k인 부분수열 합 중 최대인 값 구하기

import java.util.Arrays;

public class Test2 {
    public long solution(int[] sequence) {
        int answer = 0;

        int N = sequence.length;
        int[] sum = new int[N+1];
        int[] partSum = new int[N-2];

        sum[0] = 0;
        for (int i = 1; i<=N; i++) {
            sum[i] = sum[i-1] + sequence[i-1];

        }

        for (int j = 0; j < partSum.length; j++) {
            partSum[j] = sum[j+3] - sum[j];
        }

        answer = Arrays.stream(partSum).max().getAsInt();
        return answer;

    }
}
