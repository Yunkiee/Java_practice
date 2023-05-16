package com.example.java_practice;

// 경화는 과수원에서 귤을 수확했습니다. 경화는 수확한 귤 중 'k'개를 골라 상자 하나에 담아 판매하려고 합니다. 그런데 수확한 귤의 크기가 일정하지 않아 보기에 좋지 않다고 생각한 경화는 귤을 크기별로 분류했을 때 서로 다른 종류의 수를 최소화하고 싶습니다.
//
//예를 들어, 경화가 수확한 귤 8개의 크기가 [1, 3, 2, 5, 4, 5, 2, 3] 이라고 합시다. 경화가 귤 6개를 판매하고 싶다면, 크기가 1, 4인 귤을 제외한 여섯 개의 귤을 상자에 담으면, 귤의 크기의 종류가 2, 3, 5로 총 3가지가 되며 이때가 서로 다른 종류가 최소일 때입니다.
//
//경화가 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine이 매개변수로 주어집니다. 경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.

// 2,2,2,1,1
// [1, 1, 1, 1, 2, 2, 2, 3]
// 4,3,1

// 빈도 정렬하여
// 원소 갯수 구하기

import java.util.*;

public class Task6 {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < tangerine.length; i++) {
            if (countMap.containsKey(tangerine[i])) {
                countMap.put(tangerine[i], countMap.get(tangerine[i]) + 1);
            } else {
                countMap.put(tangerine[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(countMap.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        int answer = 0;
        for(Map.Entry<Integer, Integer> entry : entryList){
            if (k == 0) {
                break;
            }
            if (k > 0){
                k -= entry.getValue();
                answer++;
            }
        }
        return answer;
    }
}
