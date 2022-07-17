package level1;

public class MiddleString {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
    }

    public static String solution(String s) {
        String answer = "";

        int length = s.length();
        //짝수
        if(length%2 == 0) {
            answer = s.substring((length/2)-1,(length/2)+1);
        }else {//홀수
            answer = s.substring((length/2),(length/2)+1);
        }

        return answer;
    }
}
