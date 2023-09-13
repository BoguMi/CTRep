package CT;

public class CT_86491 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/86491
    public static void main(String[] args) {
        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println("sol1: " + solution(sizes1));
        System.out.println("sol2: " + solution(sizes2));
        System.out.println("sol3: " + solution(sizes3));
    }
    public static int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for(int[] arr: sizes){
            width = Math.max(width, Math.max(arr[0], arr[1]));
            height = Math.max(height, Math.min(arr[0], arr[1]));
        }
        return width * height;
    }
}
