package CT;

import java.util.Stack;

public class CT_12909 {
    public static void main(String[] args) {
        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";
        String s5 = "()()()((())))()((())()()()(((((((((((()))))))))))))((((())))))))()()(())((()))())()(((((((((()))))))()()()((())))()((())()()()(((((((((((()))))))))))))((((())))))))()()(())((()))())()(((((((((()))))))()()()((())))()((())()()()(((((((((((()))))))))))))((((())))))))()()(())((()))())()(((((((((()))))))()()()((())))()((())()()()(((((((((((()))))))))))))((((())))))))()()(())((()))())()(((((((((()))))))";

        System.out.println("###  sol1: " + solution(s1));
        System.out.println("###  sol2: " + solution(s2));
        System.out.println("###  sol3: " + solution(s3));
        System.out.println("###  sol4: " + solution(s4));
        System.out.println("###  sol5: " + solution(s5));
        System.out.println();

        System.out.println("###  sol1: " + solution2(s1));
        System.out.println("###  sol2: " + solution2(s2));
        System.out.println("###  sol3: " + solution2(s3));
        System.out.println("###  sol4: " + solution2(s4));
        System.out.println("###  sol5: " + solution2(s5));
    }
    static boolean solution(String s) {
        Stack<Boolean> stk = new Stack<>();
        for(char single : s.toCharArray()){
            if(single == '(') stk.push(true);
            else{
                try {
                    stk.pop();
                }catch(Exception e){
                    return false;
                }
            }
        }

        return stk.isEmpty() ? true : false;
    }
    //시간 통과 못함 - 졸라리 어이없네 5번 케이스 때문인듯
    static boolean solution2(String s) {
        boolean flag = true;
        int idx = 0;
        while(s.length() != 0 && flag == true){
            s = s.replace("()","");
            if(!s.contains("()")) flag = false;
            idx++;
        }
        System.out.println(idx);

        return s.length() == 0 ? true : false;
    }
}
