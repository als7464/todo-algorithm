package level1;

public class BetweenSum {
    public static void main(String[] args) {
        System.out.println(solution(3,5));
    }

    public static long solution(int a, int b) {
        long answer = 0;
        if(a == b){
            return a;
        }else {
            if (a < b) {
                for (int i = a; i <= b; i++) {
                    answer += i;
                }
            } else {
                for (int i = a; i >= b; i--) {
                    answer += i;
                }
            }
        }
        return answer;
    }
}
