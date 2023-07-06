package CT;

public class CT_147355 {

    public static void main(String[] args) {
//        t	                p	    result
//        "3141592"	        "271"	2
//        "500220839878"	"7"	    8
//        "10203"	        "15"	3
        String t1 = "3141592";
        String t2 = "500220839878";
        String t3 = "10203";
        String t4 = "10203";

        String p1 = "271";
        String p2 = "7";
        String p3 = "15";
        String p4 = "10204";

        System.out.println("sol1: "+ solution(t1,p1));
        System.out.println("sol2: "+ solution(t2,p2));
        System.out.println("sol3: "+ solution(t3,p3));
        System.out.println("sol4: "+ solution(t4,p4));
    }
    public static int solution(String t, String p) {
        int answer = 0;
        for(int i=0; i < t.length()-p.length()+1; i++){
            if(Long.valueOf(p) >= Long.valueOf(t.substring(i,i+p.length())) ) answer++;
        }
        return answer;
    }
}
