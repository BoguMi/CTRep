package CT;

import java.util.Arrays;

public class CT_12932 {
    /*
    * 문제 설명
        자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    * 제한 조건
        n은 10,000,000,000이하인 자연수입니다.
    * 입출력 예
        n	return
        12345	[5,4,3,2,1]
    * */

    public static void main(String[] args) {
        long n = 12345;
        System.out.println("sol1: " + Arrays.toString(solution(n)));
    }

    public static int[] solution(long n) {
        char[] charArr = Long.toString(n).toCharArray();
        int[] answer =  new int[charArr.length];
        int pointer = 0;
        for(int i = charArr.length-1; i >= 0; i--,pointer++){
            answer[pointer] = charArr[i] - 48;
            System.out.println(answer[pointer]);
        }

        return answer;
        //Sol1
        /*
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        return Arrays.stream(sb.reverse().toString().split("")).mapToInt(Integer::parseInt).toArray();
        */

        /*
        //Sol2
        List<Integer> intList = new ArrayList<>();
        for(String tokN : sb.reverse().toString().split("")){
            intList.add(Integer.valueOf(tokN));
        }

        return intList.stream().mapToInt(i->i).toArray();
        */
    }
}
