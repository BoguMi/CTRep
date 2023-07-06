package CT;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CT_12915 {
    /*
        strings	                n	return
        ["sun", "bed", "car"]	1	["car", "bed", "sun"]
        ["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]

     */
    public static void main(String[] args) {
        String[] strArr1 = new String[]{"sun", "bed", "car"};
        String[] strArr2 = new String[]{"sun", "bed", "car"};

        int inta = 1;
        int intb = 2;
        System.out.println("sol1: " + Arrays.toString(solution(strArr1,inta)) );
        System.out.println("sol2: " + Arrays.toString(solution(strArr2,inta)) );

    }

    public static String[] solution(String[] strings, int n) {
        Map<String, String> intputMap = new TreeMap<String, String>();

        for(String s : strings){
            intputMap.put(s, Character.toString(s.codePointAt(n)));
        }
        System.out.println("intputMap: " + intputMap);

        String[] answer = {};
        return answer;
    }

}
