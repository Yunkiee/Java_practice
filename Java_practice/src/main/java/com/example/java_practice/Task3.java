package com.example.java_practice;

// 같은 자리수를 가진 수를 형제수
// 형제 수 중 가장 큰 수 구하기

import java.util.Arrays;

public class Task3 {
    public int solution(int N) {
        int lenN = String.valueOf(N).length();
        int[] array = new int[lenN];
        int i = 0;
        while (N / 10 > 0) {
            array[i] = (N % 10);
            N /= 10;
            i++;
        }
        array[i] = N;

        reverseSort(array);
        String str = Arrays.toString(array).replaceAll("[^0-9]","");
        int answer = Integer.parseInt(str);

        if (answer > 100000000)
            return -1;
        else
            return answer;

    }

    public static void reverseSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

}
