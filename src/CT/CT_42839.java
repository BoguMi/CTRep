package CT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CT_42839 {
    //unsolved
    //https://school.programmers.co.kr/learn/courses/30/lessons/42839
    /**
     * 한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
     각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

     * 제한사항
     numbers는 길이 1 이상 7 이하인 문자열입니다.
     numbers는 0~9까지 숫자만으로 이루어져 있습니다.
     "013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.

     * 입출력 예
      numbers	return
      "17"	    3
      "011"	    2

     * 예제 #1
     [1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

     * 예제 #2
     [0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.

     * 11과 011은 같은 숫자로 취급합니다.
    * */

    public static void main(String[] args) {
        String nums1 = "17";
        String nums2 = "011";

        System.out.println("sol1: " + solution(nums1));
        System.out.println("sol2: " + solution(nums2));
    }
    public static int solution(String numbers) {

        List<Character> integerList = new ArrayList<>();
        HashSet<Integer> intCombSet = new HashSet<>();
        HashSet<Integer> oddNumSet = new HashSet<>();

        int answer = 0;

        for(int idx = 0 ; idx < numbers.length() ; idx ++){
            System.out.println("idx: " + idx + ", num: " + numbers.charAt(idx));
            intCombSet.add(Integer.valueOf(numbers.charAt(idx))-48);
            for(int secondaryIdx = idx+1; secondaryIdx < numbers.length() ; secondaryIdx ++){
                System.out.println("secondaryIdx: " + secondaryIdx + ", num: " + numbers.charAt(secondaryIdx));
                System.out.println("valBind: " + numbers.charAt(idx) + numbers.charAt(secondaryIdx));
                String concated = String.valueOf(numbers.charAt(idx)) + numbers.charAt(secondaryIdx);
                String concated2 = numbers.charAt(secondaryIdx) + String.valueOf(numbers.charAt(idx));

                intCombSet.add(Integer.valueOf(concated));
                intCombSet.add(Integer.valueOf(concated2));
            }
        }

        System.out.println(intCombSet);


        return answer;
    }

    public static Boolean isOddNum(int num){

        return true;
    }
}
