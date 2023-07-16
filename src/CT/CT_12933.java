package CT;


import java.util.Arrays;

public class CT_12933 {
    /*
    함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

    - 제한 조건
    n은 1이상 8,000,000,000 이하인 자연수입니다.
    - 입출력 예
    n	return
    118372	873211
    * */
    public static void main(String[] args) {
        Long n1 = 118372L;
        System.out.println("sol1: " + solution(n1));
    }
    public static long solution(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        return Long.parseLong(sb.reverse().toString());
    }
}
