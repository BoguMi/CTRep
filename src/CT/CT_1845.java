package CT;

import java.util.*;

public class CT_1845 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/1845
    public static void main(String[] args) {
        int[] arr1 = {3,1,2,3};     //2
        int[] arr2 = {3,3,3,2,2,4}; //3
        int[] arr3 = {3,3,3,2,2,2}; //2
        System.out.println("sol1: " + solution(arr1));
        System.out.println("sol2: " + solution(arr2));
        System.out.println("sol3: " + solution(arr3));

        System.out.println("sol1 - 1: " + solution1(arr1));
        System.out.println("sol1 - 2: " + solution1(arr2));
        System.out.println("sol1 - 3: " + solution1(arr3));
    }
    public static int solution(int[] nums) {
        Map<Integer, Integer> idxMap = new HashMap<>();
        for(int num : nums){
            if(idxMap.get(num) == null){
                idxMap.put(num,1);
            }
        }
        return nums.length/2 >= idxMap.size() ? idxMap.size() : nums.length/2;
    }
    /*
    테스트 1 〉	통과 (0.04ms, 76.7MB)     테스트 1  〉 통과 (0.06ms, 88.7MB)
    테스트 2 〉	통과 (0.03ms, 75.9MB)     테스트 2  〉 통과 (0.10ms, 72.2MB)
    테스트 3 〉	통과 (0.03ms, 71.6MB)     테스트 3  〉 통과 (0.06ms, 77MB)
    테스트 4 〉	통과 (0.04ms, 72.4MB)     테스트 4  〉 통과 (0.11ms, 76.2MB)
    테스트 5 〉	통과 (0.10ms, 74.4MB)     테스트 5  〉 통과 (0.08ms, 70.7MB)
    테스트 6 〉	통과 (0.07ms, 78.4MB)     테스트 6  〉 통과 (0.04ms, 76.9MB)
    테스트 7 〉	통과 (0.18ms, 71.6MB)     테스트 7  〉 통과 (0.30ms, 78.5MB)
    테스트 8 〉	통과 (0.32ms, 73.8MB)     테스트 8  〉 통과 (0.37ms, 72.5MB)
    테스트 9 〉	통과 (0.36ms, 74.9MB)     테스트 9  〉 통과 (0.25ms, 72.9MB)
    테스트 10 〉	통과 (0.44ms, 78.4MB)     테스트 10 〉 통과 (0.20ms, 74MB)
    테스트 11 〉	통과 (0.34ms, 73.7MB)     테스트 11 〉 통과 (0.39ms, 78.9MB)
    테스트 12 〉	통과 (0.43ms, 75MB)       테스트 12 〉 통과 (0.46ms, 66.6MB)
    테스트 13 〉	통과 (0.86ms, 73.9MB)     테스트 13 〉 통과 (0.77ms, 78.7MB)
    테스트 14 〉	통과 (0.69ms, 79.6MB)     테스트 14 〉 통과 (0.46ms, 73.7MB)
    테스트 15 〉	통과 (0.97ms, 69.5MB)     테스트 15 〉 통과 (0.96ms, 76.9MB)
    테스트 16 〉	통과 (4.25ms, 83MB)       테스트 16 〉 통과 (3.92ms, 78.3MB)
    테스트 17 〉	통과 (4.84ms, 87.1MB)     테스트 17 〉 통과 (3.79ms, 77.5MB)
    테스트 18 〉	통과 (7.24ms, 80.5MB)     테스트 18 〉 통과 (2.93ms, 80.3MB)
    테스트 19 〉	통과 (4.33ms, 81.2MB)     테스트 19 〉 통과 (2.57ms, 80.2MB)
    테스트 20 〉	통과 (7.20ms, 75.1MB)     테스트 20 〉 통과 (2.45ms, 80.8MB)
     */

    public static int solution1(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        return nums.length/2 >= numSet.size() ? numSet.size() : nums.length/2;
    }
}
