package level1;
//콜라츠 추측
// url : https://school.programmers.co.kr/learn/courses/30/lessons/12943
public class CollatzConjecture {
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }

    public static int solution(long num) {
        int answer = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num/2;
            } else {
                num = (num*3)+1;
            }
            answer++;
            if(answer>500){
                answer= -1;
                break;
            }
        }
        return answer;
    }
}
