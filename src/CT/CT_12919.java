package CT;

import java.util.Arrays;

public class CT_12919 {
    /*

    Solved
    https://school.programmers.co.kr/learn/courses/30/lessons/12919
    String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
    seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

    제한 사항
    seoul은 길이 1 이상, 1000 이하인 배열입니다.
    seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
    "Kim"은 반드시 seoul 안에 포함되어 있습니다.
    입출력 예
    seoul	return
    ["Jane", "Kim"]	"김서방은 1에 있다"
     */
    public static void main(String[] args) {
        String[] str1 = {"Jane", "Kim"};
        String[] str2 = {"Jane", "sam", "Kim"};
        System.out.println("sol1: "+solution(str1));
        System.out.println("sol1: "+solution(str2));
    }
    public static String solution(String[] seoul) {
        int a = 0;
        for(String str: seoul){
            if(str.equals("Kim")) break;
            a++;
        }
        return new StringBuilder("김서방은 ").append(a).append("에 있다.").toString();
    }

    /*
    테스트 1 〉	통과 (0.06ms, 75.1MB)     테스트 1 〉	통과 (0.07ms, 77.5MB)
    테스트 2 〉	통과 (0.10ms, 71.3MB)     테스트 2 〉	통과 (0.08ms, 77.2MB)
    테스트 3 〉	통과 (0.13ms, 72.5MB)     테스트 3 〉	통과 (0.05ms, 72.7MB)
    테스트 4 〉	통과 (0.10ms, 75.8MB)     테스트 4 〉	통과 (0.07ms, 80MB)
    테스트 5 〉	통과 (0.08ms, 79.4MB)     테스트 5 〉	통과 (0.07ms, 75.6MB)
    테스트 6 〉	통과 (0.10ms, 76.5MB)     테스트 6 〉	통과 (0.04ms, 78.9MB)
    테스트 7 〉	통과 (0.12ms, 70.7MB)     테스트 7 〉	통과 (0.06ms, 78.6MB)
    테스트 8 〉	통과 (0.11ms, 80.3MB)     테스트 8 〉	통과 (0.06ms, 82.1MB)
    테스트 9 〉	통과 (0.12ms, 78.7MB)     테스트 9 〉	통과 (0.07ms, 79.2MB)
    테스트 10 〉	통과 (0.11ms, 74.6MB)     테스트 10 〉	통과 (0.07ms, 75.5MB)
    테스트 11 〉	통과 (0.09ms, 75.1MB)     테스트 11 〉	통과 (0.07ms, 74.1MB)
    테스트 12 〉	통과 (0.07ms, 81.3MB)     테스트 12 〉	통과 (0.05ms, 76.7MB)
    테스트 13 〉	통과 (0.11ms, 78.4MB)     테스트 13 〉	통과 (0.08ms, 78.6MB)
    테스트 14 〉	통과 (0.09ms, 76.4MB)     테스트 14 〉	통과 (0.12ms, 75.1MB)
     */
}
