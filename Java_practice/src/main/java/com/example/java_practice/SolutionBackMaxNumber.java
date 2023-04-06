package com.example.java_practice;


import java.util.Stack;

public class SolutionBackMaxNumber {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                // 뒤에 있는 큰 수에 해당하는 모든 값 pop
                answer[stack.pop()] = numbers[i];
            }

            stack.push(i);
        }
        while (!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }

}
