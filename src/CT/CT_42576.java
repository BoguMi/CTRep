package CT;

import java.util.HashMap;
import java.util.Map;

public class CT_42576 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42577
    public static void main(String[] args) {
        String[] par1 = {"leo", "kiki", "eden"};
        String[] comp1 = {"eden", "kiki"};

        String[] par2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] comp2 = {"josipa", "filipa", "marina", "nikola"};

        String[] par3 = {"mislav", "stanko", "mislav", "ana"};
        String[] comp3 = {"stanko", "ana", "mislav"};

        System.out.println("sol1: " + solution(par1, comp1));
        System.out.println("sol2: " + solution(par2, comp2));
        System.out.println("sol3: " + solution(par3, comp3));
    }
    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> parMap = new HashMap<>();
        String answer = "";

        for(String par: participant){
            parMap.put(par, parMap.getOrDefault(par, 0) + 1);
        }
        for(String comp : completion){
            if(parMap.get(comp) == null) return comp;
            parMap.put(comp, parMap.get(comp)-1);
        }
        for(String key : parMap.keySet()){
            if(parMap.get(key) != 0) answer = key;
        }

        return answer;
    }
    //정확성  테스트
    //테스트 1 〉	통과 (0.07ms, 74.4MB)
    //테스트 2 〉	통과 (0.11ms, 67MB)
    //테스트 3 〉	통과 (0.53ms, 81.3MB)
    //테스트 4 〉	통과 (1.14ms, 81.6MB)
    //테스트 5 〉	통과 (0.97ms, 82.1MB)
    //테스트 6 〉	통과 (0.05ms, 76.2MB)
    //테스트 7 〉	통과 (0.07ms, 71.8MB)
    //효율성  테스트
    //테스트 1 〉	통과 (48.48ms, 83MB)
    //테스트 2 〉	통과 (83.12ms, 90.5MB)
    //테스트 3 〉	통과 (96.53ms, 95MB)
    //테스트 4 〉	통과 (78.58ms, 98.3MB)
    //테스트 5 〉	통과 (81.46ms, 97MB)
}
