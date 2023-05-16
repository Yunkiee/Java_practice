package com.example.java_practice;

// 영화 빈도수 정렬

import java.util.*;

public class Test1 {
    public String[] solution(String[] movie) {
        Map<String, Integer> movieMap = new HashMap<String, Integer>();

        int N = movie.length;
        for (int i = 0; i < N; i++) {
            if (movieMap.containsKey(movie[i])) {
                movieMap.put(movie[i], movieMap.get(movie[i]) + 1);
            } else {
                movieMap.put(movie[i], 1);
            }
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(movieMap.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        String[] ans = new String[entryList.size()];

        int index = 0;
        for(Map.Entry<String, Integer> entry : entryList){
            ans[index++] = entry.getKey();
        }

        return ans;
    }
}
