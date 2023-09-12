package CT;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CT_42587 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42587
    /*
    * 운영체제의 역할 중 하나는 컴퓨터 시스템의 자원을 효율적으로 관리하는 것입니다.
    *  이 문제에서는 운영체제가 다음 규칙에 따라 프로세스를 관리할 경우 특정 프로세스가 몇 번째로 실행되는지 알아내면 됩니다.

    1. 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
    2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
    3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
      3.1 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.
    예를 들어 프로세스 4개 [A, B, C, D]가 순서대로 실행 대기 큐에 들어있고, 우선순위가 [2, 1, 3, 2]라면 [C, D, A, B] 순으로 실행하게 됩니다.

    * 현재 실행 대기 큐(Queue)에 있는 프로세스의 중요도가 순서대로 담긴 배열 priorities와,
    * 몇 번째로 실행되는지 알고싶은 프로세스의 위치를 알려주는 location이 매개변수로 주어질 때,
    * 해당 프로세스가 몇 번째로 실행되는지 return 하도록 solution 함수를 작성해주세요.

    제한사항
    priorities의 길이는 1 이상 100 이하입니다.
    priorities의 원소는 1 이상 9 이하의 정수입니다.
    priorities의 원소는 우선순위를 나타내며 숫자가 클 수록 우선순위가 높습니다.
    location은 0 이상 (대기 큐에 있는 프로세스 수 - 1) 이하의 값을 가집니다.
    priorities의 가장 앞에 있으면 0, 두 번째에 있으면 1 … 과 같이 표현합니다.
    입출력 예
    priorities	location	return
    [2, 1, 3, 2]	2	1
    [1, 1, 9, 1, 1, 1]	0	5

    예제 #2
    6개의 프로세스 [A, B, C, D, E, F]가 대기 큐에 있고 중요도가 [1, 1, 9, 1, 1, 1] 이므로 [C, D, E, F, A, B] 순으로 실행됩니다. 따라서 A는 5번째로 실행됩니다.*/
    public static void main(String[] args) {
        int[] priors1 = {2, 1, 3, 2};
        int loc1 = 2;

        int[] priors2 = {1, 1, 9, 1, 1, 1};
        int loc2 = 0;

        System.out.println("sol1: " + solution(priors1,loc1));
        System.out.println("sol2: " + solution(priors2,loc2));
    }

    public static int solution(int[] priorities, int location) {
        Queue<Job> que = new LinkedList<>();
        int idx = 0;
        int highestPriority = -1;
        for(int p : priorities){
            if(p > highestPriority) highestPriority = p;
            que.add(new Job(idx, p));
            idx++;
        }

        int executeorder = 1;
        while(que.size() != 0) {

            boolean isHigh = false;
            for(Job job: que){
                System.out.println("idx: " + job.idx);
                if(job.priority > highestPriority) highestPriority = job.priority;
                else que.add(que.remove());
            }
            if(highestPriority == que.peek().priority)

            for (Job job : que) {
                if(job.priority == highestPriority){
                    job.exeOrder = executeorder;
                    executeorder++;
                }
            }

            highestPriority = -1;
        }

        int answer = 0;
        return answer;
    }

    static class Job{
        int idx;
        int priority;
        int exeOrder;
        public Job(int idx, int priority){
            this.idx = idx;
            this.priority = priority;
        }
        public void setExeOrder(int exeOrder){
            this.exeOrder = exeOrder;
        }
    }
}
