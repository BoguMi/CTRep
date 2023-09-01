package CT;

public class CT_12934_unsolved {
    /*
    임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
    n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

    - 제한 사항
    n은 1이상, 50,000,000,000,000 이하인 양의 정수입니다.
    - 입출력 예
    n	return
    121	144
    3	-1
    - 입출력 예 설명
    입출력 예#1
    121은 양의 정수 11의 제곱이므로, (11+1)를 제곱한 144를 리턴합니다.

    입출력 예#2
    3은 양의 정수의 제곱이 아니므로, -1을 리턴합니다.
    * */
    public static void main(String[] args) {
        long n1 = 144;
        long n2 = 3;
        long n3 = 14641;
        System.out.println("sol1: " + solution(n1));
        System.out.println("sol2: " + solution(n2));
        System.out.println("sol3: " + solution(n3));
    }
    public static long solution(long n) {
        long answer = -1;
        long a = 1;
        while(a*a <= n){
            if(a*a == n) answer = a;
            a++;
        }
        return answer == -1 ? -1: (answer+1) * (answer+1);
    }
}
