package level1;
//시저암호
//URL : https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(solution("AB",1));
        System.out.println(solution("z",1));
        System.out.println(solution("a B z",4));
    }

    public static String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++) {
            char nChr = s.charAt(i);
            if(nChr != ' '){
                //대소문자 비교
                if('A'<= nChr && nChr <= 'Z') {
                    /*if(nChr == 'Z'){
                        nChr = (char)(nChr-26+n);
                    }else{
                        nChr +=(char)n;
                    }*/
                    //조언 받음
                    nChr = (char) ((nChr - 'A' + n) % 26 + 'A');
                }else if('a'<= nChr && nChr <= 'z') {
                    /*if (nChr == 'z'){
                        nChr = (char)(nChr-26+n);
                    }else{
                        nChr +=(char)n;
                    }*/
                    //조언 받음
                    nChr = (char) ((nChr - 'a' + n) % 26 + 'a');
                }
                answer += nChr;
            }else{
                answer += nChr;
            }
        }
        return answer;
    }
}
