package CT;

import java.util.HashMap;
import java.util.Map;

public class CT_42578 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42578

    public static void main(String[] args) {
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println("sol1: " + solution(clothes1));
        System.out.println("sol2: " + solution(clothes2));
    }

    public static int solution(String[][] clothes) {
        Map<String, Integer> clothesMap = new HashMap<>();

        for(String[] eachClothes : clothes){
            clothesMap.put(eachClothes[1], clothesMap.getOrDefault(eachClothes[1],1)+1);
        }

        int temp = 1;
        for(String key : clothesMap.keySet()){
            temp *= clothesMap.get(key);
        }

        return temp - 1;
    }
}
