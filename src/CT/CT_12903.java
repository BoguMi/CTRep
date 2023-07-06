package CT;

public class CT_12903 {
    public static void main(String[] args) {
        String case1 = "abcde";
        String case2 = "qwer";
        System.out.println("sol1: " + solution(case1));
        System.out.println("sol2: " + solution(case2));
        /*
        단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
        단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

        제한사항
        s는 길이가 1 이상, 100이하인 스트링입니다.

        입출력 예
        s	    return
        "abcde"	"c"
        "qwer"	"we"
         */
    }

    public static String solution(String s) {
        String answer = "";
        int strLength = s.length();
        if(strLength % 2 == 1){
            answer = Character.toString(s.charAt(strLength/2));
        }else{
            answer = s.substring(strLength/2-1,strLength/2+1);
        }

        return answer;
    }

}
