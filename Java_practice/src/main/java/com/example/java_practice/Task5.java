package com.example.java_practice;

//어떤 수열의 연속 부분 수열에 같은 길이의 펄스 수열을 각 원소끼리 곱하여 연속 펄스 부분 수열을 만들려 합니다. 펄스 수열이란 [1, -1, 1, -1 …] 또는 [-1, 1, -1, 1 …] 과 같이 1 또는 -1로 시작하면서 1과 -1이 번갈아 나오는 수열입니다.
//예를 들어 수열 [2, 3, -6, 1, 3, -1, 2, 4]의 연속 부분 수열 [3, -6, 1]에 펄스 수열 [1, -1, 1]을 곱하면 연속 펄스 부분수열은 [3, 6, 1]이 됩니다. 또 다른 예시로 연속 부분 수열 [3, -1, 2, 4]에 펄스 수열 [-1, 1, -1, 1]을 곱하면 연속 펄스 부분수열은 [-3, -1, -2, 4]이 됩니다.
//정수 수열 sequence가 매개변수로 주어질 때, 연속 펄스 부분 수열의 합 중 가장 큰 것을 return 하도록 solution 함수를 완성해주세요.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task5 {
    public long solution(int[] sequence) {
        long answer = 0;
        List<Long> pulse1 = getPulse(sequence);

        answer = Collections.max(pulse1) - Collections.min(pulse1);
        long answer2 = Arrays.stream(sequence).max().getAsInt();
        long answer3 = Arrays.stream(sequence).min().getAsInt() * -1;

        if (answer < answer2)
            return answer2;
        if (answer < answer3)
            return answer3;

        return answer;
    }

    public List<Long> getPulse(int[] sequence) {
        int L = sequence.length;
        List<Long> pulseSequence = new ArrayList<Long>();
        pulseSequence.add(0,0L);
        if (L >= 2) {
            for(int i = 0; i < L; i++) {
                if (i % 2 == 0)
                    pulseSequence.add(i+1,pulseSequence.get(i) + sequence[i]);
                else
                    pulseSequence.add(i+1,pulseSequence.get(i) - sequence[i]);
            }
        }
        return pulseSequence;
    }

//    public List<Long> getPulse2(int[] sequence) {
//        int L = sequence.length;
//        List<Long> pulseSequence = new ArrayList<Long>();
//        pulseSequence.add(0,0L);
//        if (L >= 2) {
//            for(int i = 0; i < L; i++) {
//                if (i % 2 == 0)
//                    pulseSequence.add(i+1,pulseSequence.get(i) - sequence[i]);
//                else
//                    pulseSequence.add(i+1,pulseSequence.get(i) + sequence[i]);
//            }
//        }
//        return pulseSequence;
//    }
}
