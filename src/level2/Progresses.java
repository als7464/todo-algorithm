package level2;
//기능개발
// url : https://school.programmers.co.kr/learn/courses/30/lessons/42586


import java.util.*;

public class Progresses {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55},new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99},new int[]{1, 1, 1, 1, 1, 1})));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        //결과
        ArrayList<Integer> rList = new ArrayList<>();

        //완료일
        Queue<Integer> finishDays = new LinkedList<>();

        //각자 작업완료 일수 확인하기
        for(int i=0; i<progresses.length; i++){
            int day = 0;
            //작업진도 +(작업 속도 * day) > 100
            while(progresses[i] + (speeds[i] * day) < 100){
                day++;
            }
            finishDays.add(day);
        }

        //횟수
        int cnt =1;

        //비교 대상을 위해 가장 첫번째꺼 배출
        int first = finishDays.remove();
        while(!finishDays.isEmpty()){
            int p = finishDays.remove();
            if(first < p){
                rList.add(cnt);
                first = p;
                cnt=1;
            }else{
                cnt++;
            }
        }

        //마지막 카운드 기입
        rList.add(cnt);

        //결과값 int배열 반환
        int[] answer = new int[rList.size()];
        for(int j=0; j<rList.size(); j++){
            answer[j] = rList.get(j);
        }
        return answer;
    }
}
