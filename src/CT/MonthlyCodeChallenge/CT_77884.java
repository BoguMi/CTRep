package CT.MonthlyCodeChallenge;

public class CT_77884 {
    /**
     * 두 정수 left와 right가 매개변수로 주어집니다.
     * left부터 right까지의 모든 수들 중에서,
     * 약수의 개수가 짝수인 수는 더하고,
     * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
     * */
    public static void main(String[] args) {
        int l1 = 13;
        int r1 = 17;
        int l2 = 24;
        int r2 = 27;

        System.out.println("sol1: " + solution(l1,r1));
        System.out.println("sol2: " + solution(l2,r2));
    }
    public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right ;i++){
            if(canAdd(i)) answer += i;
            else answer -= i;
        }

        return answer;
    }

    public static Boolean canAdd(int num){
        int cnt = 0;
        for(int i = 1; i * i <= num; i++){
            if(i*i == num) cnt++;
            else if(num % i == 0) cnt+=2;
        }

        return cnt%2 == 0;
    }
}
