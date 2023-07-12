package CT;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CT_12954 {
    /*
    * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

        제한 조건
        x는 -10,000,000 이상, 10,000,000 이하인 정수입니다.
        n은 1000 이하인 자연수입니다.

        * 입출력 예
        x	n	answer
        2	5	[2,4,6,8,10]
        4	3	[4,8,12]
        -4	2	[-4, -8]
    * */
    public static void main(String[] args) {
        int x1 = 2;
        int n1 = 5;
        int x2 = 4;
        int n2 = 3;
        int x3 = -4;
        int n3 = 2;

        System.out.println("sol1: " + Arrays.toString(solution(x1,n1)));
        System.out.println("sol2: " + Arrays.toString(solution(x2,n2)));
        System.out.println("sol3: " + Arrays.toString(solution(x3,n3)));
    }
    public static long[] solution(int x, int n) {
        List<Long> answerList = new ArrayList<>();
        Long each = 0L;
        for(int i = 1; i <=n ;i++){
            each += x;
            answerList.add(each);
        }
        return answerList.stream().mapToLong(i->i).toArray();
        //return answerList.toArray();
    }
}
