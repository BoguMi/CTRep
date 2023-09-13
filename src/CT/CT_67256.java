package CT;

public class CT_67256 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";

        int[] nums2 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";

        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";

        System.out.println("sol1: " + solution(nums1, hand1));
        System.out.println("ans1: LRLLLRLLRRL\n");

        System.out.println("sol2: " + solution(nums2, hand2));
        System.out.println("ans2: LRLLRRLLLRR\n");

        System.out.println("sol3: " + solution(nums3, hand3));
        System.out.println("ans3: LLRLLRLLRL\n");

    }
    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int lastL = 10;
        int lastR = 12;
        hand = hand.equals("right") ? "R" : "L";
        for(int num : numbers){
            if(num == 0) num = 11;
            switch (num % 3){
                case 0 :
                    answer.append("R");
                    lastR = num;
                    break;
                case 1 :
                    answer.append("L");
                    lastL = num;
                    break;
                case 2 :
                    int distR = Math.abs(((lastR - num) / 3) + ((lastR - num) % 3));
                    int distL = Math.abs(((lastL - num) / 3) + ((lastL - num) % 3 ));
                    if( distR > distL ) {
                        answer.append("L");
                        lastL = num;
                    }
                    else if( distR < distL ) {
                        answer.append("R");
                        lastR = num;
                    }
                    else{
                        answer.append(hand);
                        if (hand.equals("R")) lastR = num;
                        if (hand.equals("L")) lastL = num;
                    }
                    break;
            }
        }
        return answer.toString();
    }
}
