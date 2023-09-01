/**
*@author : MZC01-BEN 
*@name   : CT_12912.java
*@date   : 2023-07-19 오후 5:57
*
*/
package CT;

public class CT_12912 {
    /*
    - 문제 설명
    두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
    예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

    - 제한 조건
    a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
    a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
    a와 b의 대소관계는 정해져있지 않습니다.
    - 입출력 예
    a	b	return
    3	5	12
    3	3	3
    5	3	12
    * */
    public static void main(String[] args) {
        int a1 = 3;
        int b1 = 5;
        int a2 = 3;
        int b2 = 3;
        int a3 = 5;
        int b3 = 3;
        System.out.println("sol1: " + solution(a1,b1));
        System.out.println("sol2: " + solution(a2,b2));
        System.out.println("sol3: " + solution(a3,b3));
    }
    public static long solution(int a, int b) {
        int big;
        int small;
        long answer = 0;
        if(a > b){
            big = a;
            small = b;
        }
        else if (a < b){
            big = b;
            small = a;
        }else{ return a; }
        for(int i = small; i <= big; i ++){ answer += i; }

        return answer;
    }
}
