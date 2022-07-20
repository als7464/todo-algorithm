package level1;
//부족한 금액 계산하기
// url : https://school.programmers.co.kr/learn/courses/30/lessons/82612

public class InsufficientAmount {
    public static void main(String[] args) {
        System.out.println(solution(3,20,4));
    }

    public static long solution(int price, int money, int count) {
        long answer = 0;

        //price 놀이기구 탄 회수 총 필요한금액
        for(int i=0; i<=count; i++){
            answer +=(price*i);
        }

        //금액 부족 조회 여부
        if ( answer > money ) {
            answer-=money;
        } else {
            //금액이 부족하지 않으면 0을 return
            answer = 0;
        }
        return answer;
    }
}
