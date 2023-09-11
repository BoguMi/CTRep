package CT;

import java.util.*;

public class CT_42577 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42577
    public static void main(String[] args) {
        String[] ph1 = {"119", "97674223", "1195524421"};
        String[] ph2 = {"123","456","789"};
        String[] ph3 = {"12","123","1235","567","88"};

        System.out.println("sol1: " + solution(ph1));
        System.out.println("sol2: " + solution(ph2));
        System.out.println("sol3: " + solution(ph3));
    }
    public static boolean solution1(String[] phone_book) {
        boolean answer = true;
        for(String phone : phone_book){
            for(String phone2 : phone_book){
                if(!phone.equals(phone2) && phone.contains(phone2)) answer = false;
            }
        }

        return answer;
    }
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length -1; i++){
            if(phone_book[i].startsWith(phone_book[i+1]) || phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
