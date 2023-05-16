package com.example.java_practice;

// 징검다리 건너기
// {4,1,2,3,1,0,5}
// 4 -> (-)1 -> 3 -> 5
// 마지막 인덱스로 가는 방법
// 미완료

public class Test3 {
    public int solution(int[] nums) {
        int N = nums.length;
        int answer = 0;
        int index = 0;
        while(index < N) {
            index += nums[index];
            answer++;
            System.out.print(index + " ");
            if (index == N-1)
                break;
        }
        return answer;
    }
}
