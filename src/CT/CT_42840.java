package CT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CT_42840 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/42840
    public static void main(String[] args) {
        int[] answers1 = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};
        System.out.println("sol1:" + Arrays.toString(solution(answers1)));
        System.out.println("sol2:" + Arrays.toString(solution(answers2)));
    }
    public static int[] solution(int[] answers) {
        List<Student> studentList = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();
        studentList.add(new Student(new int[]{1,2,3,4,5}));
        studentList.add(new Student(new int[]{2,1,2,3,2,4,2,5}));
        studentList.add(new Student(new int[]{3,3,1,1,2,2,4,4,5,5}));

        int idx = 0;
        int maxCorrect = 0;
        for(int answer : answers){
            for(Student st : studentList){
                if(st.ownAnswers[idx % st.ownAnswers.length] == answer) st.correct += 1;
                if(maxCorrect < st.correct) maxCorrect = st.correct;
            }
            idx++;
        }
        int answerIdx = 0;
        for(Student st : studentList){
            if(st.correct == maxCorrect) {
                answerList.add(studentList.indexOf(st) + 1);
                answerIdx++;
            }
        }

        return answerList.stream().mapToInt(i->i).toArray();
    }
    public static class Student{
        int[] ownAnswers;
        int correct;
        public Student(int[] answers){
            this.ownAnswers = answers;
            this.correct = 0;
        }
    }

    public static int[] solution1(int[] answers) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(new int[]{1,2,3,4,5}));
        studentList.add(new Student(new int[]{2,1,2,3,2,4,2,5}));
        studentList.add(new Student(new int[]{3,3,1,1,2,2,4,4,5,5}));

        int idx = 0;
        int maxCorrect = 0;
        for(int answer : answers){
            for(Student st : studentList){
                if(st.ownAnswers[idx % st.ownAnswers.length] == answer) st.correct += 1;
                if(maxCorrect < st.correct) maxCorrect = st.correct;
            }
            idx++;
        }
        int answerIdx = 0;
        for(Student st : studentList) if(st.correct == maxCorrect) answerIdx++;

        int[] finalAnswer = new int[answerIdx];
        for(Student st : studentList){
            if(st.correct == maxCorrect) finalAnswer[finalAnswer.length - answerIdx] = studentList.indexOf(st)+1;
            answerIdx--;
        }

        return finalAnswer;
    }
}
