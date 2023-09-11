package CT;

import java.util.*;

public class CT_42586_2 {

    public static void main(String[] args) {
        int[] prog1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};

        int[] prog2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        //System.out.println("sol1: " + Arrays.toString(solution(prog1, speeds1)));
        //System.out.println("sol2: " + Arrays.toString(solution(prog2, speeds2)));

        System.out.println("sol1: " + Arrays.toString(solutionWithQueue(prog1, speeds1)));
        System.out.println("sol2: " + Arrays.toString(solutionWithQueue(prog2, speeds2)));
    }


    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        int[] days = new int [progresses.length];
        int indexForDay = 0;    //인덱스용
        int day = 0;            //소요일
        for(int prog : progresses){
            while(100 > prog + day * speeds[indexForDay]){
                day++;
            }
            days[indexForDay] = day;
            indexForDay++;
            day = 0;
        }

        int indicator = 0;
        int beforeVal = days[indicator];
        int deployNum = 0;

        for(int consumeDay: days){
            System.out.println("consumeDay: " + consumeDay);
            if(consumeDay <= beforeVal){
                deployNum++;
            }else{
                answerList.add(deployNum);
                deployNum = 1;
                indicator++;
                beforeVal = days[indicator];
            }
        }
        answerList.add(deployNum);

        return answerList.stream().mapToInt(i->i).toArray();
    }

    public static int[] solutionWithQueue(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        int idx = 0;
        for(int prog : progresses){
            int days = (int)Math.ceil((100 - prog) / (double)speeds[idx]);
            if(!q.isEmpty() && q.peek() < days){
                answerList.add(q.size());
                q.clear();
            }
            q.add(days);
            idx++;
        }
        answerList.add(q.size());

        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
