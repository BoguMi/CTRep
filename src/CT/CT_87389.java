package CT;

public class CT_87389 {
    public static void main(String[] args) {
        int n1 = 10; //result 3
        int n2 = 12; //result 11

        System.out.println("sol1: " + solution(n1));
        System.out.println("sol2: " + solution(n2));
    }

    public static int solution(int n) {
        int answer = 0;
        for(int i = n; i>=2;i--){
            if( n%i == 1) answer = i;
        }
        return answer;
    }
}
