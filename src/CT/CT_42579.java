package CT;

import java.util.*;

public class CT_42579 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42579
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println("sol1: " + solution(genres,plays));
    }

    public static int[] solution1(String[] genres, int[] plays) {
        Map<String, Integer> playMap = new HashMap<>();
        List<Map<String,Integer>> playList = new ArrayList<>();
        List<Integer> order = new ArrayList<>();
        int idx = 0;
        for(String genre : genres){
            playMap.put(genre, playMap.getOrDefault(genre,0) + plays[idx]);
            idx++;
        }
        //Val값 기준 sorting
        for(String key : playMap.keySet()){
            System.out.println("key: " + key);
            System.out.println("val: " + playMap.get(key));
        }
        //genre 내 sorting

        int[] answer = {};
        return answer;
    }

    public static int[] solution(String[] genres, int[] plays) {
        Map<Integer, Map<String, Integer>> myMap = new HashMap<>();

        return null;
    }
}
