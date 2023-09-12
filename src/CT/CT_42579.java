package CT;

import java.util.*;

public class CT_42579 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42579
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println("sol1: " + Arrays.toString(solution1(genres,plays)));
    }

    public static int[] solution1(String[] genres, int[] plays) {
        Map<String, Integer> playMap = new HashMap<>();
        //idx genre play
        int idx = 0;
        for(String genre : genres){
            playMap.put(genre, playMap.getOrDefault(genre,0) + plays[idx]);
            idx++;
        }
        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(playMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        ArrayList<Music> result = new ArrayList<>();
        for(Map.Entry entry : entryList){
            int listIdx = 0;
            ArrayList<Music> list = new ArrayList<>();
            for(int i=0; i<genres.length; i++){
                if(genres[i].equals(entry.getKey())){
                    list.add(new Music(i, plays[i], (String)entry.getKey()));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play); // 내림차순 소팅
            result.add(list.get(0)); 	// 1개는 무조건 수록
            if(list.size()!=1){ 	// 더 수록할 곡이 있으면(==장르 내의 노래가 1개보다 많으면) 수록
                result.add(list.get(1));
            }
        }

        // print result
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i).idx;
        }
        return answer;
    }
    static class Music{
        int idx;
        int play;
        String genre;
        public Music(int idx, int play, String genre){
            this.idx = idx;
            this.play = play;
            this.genre = genre;
        }
    }


    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Map<Integer, Integer>> genreMap = new HashMap<>();
        //장르, 인덱스, 재생횟수
        Map<Integer, Integer> playMap = new HashMap<>();

        int idx = 0;
        for(String genre : genres){
            playMap.put(idx, plays[idx]);
            genreMap.put(genre, playMap);
            idx++;
        }

        return null;
    }

}
