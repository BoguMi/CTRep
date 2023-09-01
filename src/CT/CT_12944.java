package CT;

import java.util.Arrays;

public class CT_12944 {
    /*
    * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

     - 제한사항
     arr은 길이 1 이상, 100 이하인 배열입니다.
     arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

     - 입출력 예
     arr	return
     [1,2,3,4]	2.5
     [5,5]	5
    * */
    public static void main(String[] args) {
        int[] n1 = {1,2,3,4};
        int[] n2 = {5,5};

        System.out.println("sol1: " + solution(n1));
        System.out.println("sol2: " + solution(n2));

        System.out.println("\nsol2-1: " + solution2(n1));
        System.out.println("sol2-2: " + solution2(n2));
    }

    public static double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
    public static double solution2(int[] arr) {
        if(arr.length == 0) return 0;
        int sum = 0;
        for(int eachInt :arr){ sum += eachInt; }
        return (double)sum/arr.length;
    }
}
