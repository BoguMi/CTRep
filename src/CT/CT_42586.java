package CT;

import java.util.*;

public class CT_42586 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42586
    public static void main(String[] args) {
        int[] pro1 = {93, 30, 55};
        int[] pro2 = {95, 90, 99, 99, 80, 99};

        int[] speed1 = {1,30,5};
        int[] speed2 = {1,1,1,1,1,1};

        System.out.println("sol1" + Arrays.toString(solution(pro1, speed1)));
        System.out.println("sol2" + Arrays.toString(solution(pro2, speed2)));
    }

    public static int[] solution2(int[] progresses, int[] speeds) {
        boolean complete = false;
        Queue<Integer> progQueue = new LinkedList<>();
        HashMap<Integer, Integer> progMap = new HashMap<>();
        Map<Integer, Integer> deployMap = new HashMap<>();
        int idx = 0;
        for(int progress: progresses){
            progMap.put(idx, progress);
            progQueue.add(idx);
            idx++;
        }

        int deployIdx = 0;
        for(int days = 1; complete != true ; days++){
            for(Integer key : progMap.keySet()){
                progMap.put(key, progMap.get(key) + speeds[key]);
                System.out.println(progMap);
                if(progMap.get(key) + speeds[key] >= 100 ) {
                    deployMap.put(key, deployMap.get(key) != null
                            ? deployMap.get(key)+1
                            : 1);

                }
            }
            for(Integer key : deployMap.keySet()){

            }
            System.out.println("progMapSize: " + progMap.size());
            System.out.println("deployMap: " + deployMap.size());
            if(deployMap.size() == progMap.size()) complete = true;
        }
        System.out.println(progMap.getClass());
        int[] answer = {};
        return answer;
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] cosumeDate = new int[progresses.length];
        List<Integer> dayList = new ArrayList<>();

        int idx = 0;
        for(int prog: progresses){
            int day = 1;
            while(100 > prog + (day * speeds[idx])){
                day++;
            }
            cosumeDate[idx] = day;
            idx++;
        }
        int x = cosumeDate[0];
        int count = 1;
        for(int i=1;i<progresses.length;i++){

            if(x>=cosumeDate[i]){
                count+=1;
            }else{
                dayList.add(count);
                count =1;
                x= cosumeDate[i];
            }
        }
        dayList.add(count);

        return dayList.stream().mapToInt(i->i).toArray();
    }
}
