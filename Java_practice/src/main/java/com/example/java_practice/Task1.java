package com.example.java_practice;

//정수 N이 주어졌을 때, N보다 크고 그 자릿수의 합이 N 정수의 자릿수의 합과 같은 가장 작은 정수를 반환하는 함수를 작성하세요.

public class Task1 {
    public int solution(int N) {
        int answer = N + 1;
        int digitN = getDigitValue(N);

        while (true) {
            if (digitN == getDigitValue(answer)) {
                break;
            }
            answer++;
        }

        return answer;
    }

    public int getDigitValue(int N) {
        int digit = 0;
        while (N / 10 > 0) {
            digit += (N % 10);
            N /= 10;
        }
        digit += N;

        return digit;
    }
}
