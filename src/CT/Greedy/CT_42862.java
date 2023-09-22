package CT.Greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CT_42862 {
    /**
      점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다.
     학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다.
     예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다.
     체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
     전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때,
     체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.

     * 제한사항
     전체 학생의 수는 2명 이상 30명 이하입니다.
     체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
     여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
     여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다.
     이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
     * 입출력 예
     n	lost	reserve	    return
     5	[2, 4]	[1, 3, 5]	5
     5	[2, 4]	[3]	        4
     3	[3]	    [1]	        2

     * 예제 #1
     1번 학생이 2번 학생에게 체육복을 빌려주고, 3번 학생이나 5번 학생이 4번 학생에게 체육복을 빌려주면 학생 5명이 체육수업을 들을 수 있습니다.

     * 예제 #2
     3번 학생이 2번 학생이나 4번 학생에게 체육복을 빌려주면 학생 4명이 체육수업을 들을 수 있습니다.
     */
    //그리디
    //https://school.programmers.co.kr/learn/courses/30/lessons/42862
    public static void main(String[] args) {
        int n1 = 5;
        int[] lost1 = {2, 4};
        int[] reserve1 = {1,3,5};

        int n2 = 5;
        int[] lost2 = {2,4};
        int[] reserve2 = {3};

        int n3 = 5;
        int[] lost3 = {3};
        int[] reserve3 = {1};

        System.out.println("sol1: " + solution1(n1,lost1,reserve1));
        System.out.println("sol2: " + solution1(n2,lost2,reserve2));
        System.out.println("sol3: " + solution1(n3,lost3,reserve3));
    }
    public static int solution(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();
        for(int r : reserve){
            reserveList.add(r);
        }
        for(int l : lost){

            lostList.add(l);
        }

        return n - lostList.size();
    }


    public static int solution1(int n, int[] lost, int[] reserve) {
        Map<Integer,Integer> studentMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            int clothes = 1;
            for(int l : lost){ if(l==i+1) clothes -= 1; }
            for(int r : reserve){ if(r==i+1) clothes += 1; }
            if(clothes != 1) studentMap.put(i+1,clothes);
            System.out.println("key: " + (i+1));
            System.out.println("val: "+studentMap.get(i+1));
        }

        System.out.println("\n\n");
        int answer = 0;
        for(Integer key : studentMap.keySet()){
            if(studentMap.get(key) != 0) continue;
            System.out.println("key1: "+ (key-1));
            System.out.println("key2: "+ (key+1));
            System.out.println("val1: "+studentMap.getOrDefault(key - 1,0));
            System.out.println("val2: "+studentMap.getOrDefault(key + 1,0));
            int ind = -1;
            if(studentMap.getOrDefault(key - 1,0) == 2) ind = key -1;
            else if(studentMap.getOrDefault(key + 1,0) == 2) ind = key +1;

            if(ind != -1) {
                System.out.println("값있: " + ind + ", key: " + key);
                studentMap.put(ind,1);
                studentMap.put(key,1);
            }else{
                System.out.println("못찾음");
                answer++;
            }
        }

        return n - answer;
    }
}
