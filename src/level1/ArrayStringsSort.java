package level1;

import java.util.*;

public class ArrayStringsSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"},1)));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        //알파벳 배열
        char[] alpa = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        //사전적으로 앞선 문자열
        Arrays.sort(strings);

        int sort = 0;
        for(int i=0; i<alpa.length; i++) {
            //if (sort == strings.length) break;
            for(int j=0; j<strings.length; j++){
                char nStr = strings[j].charAt(n);
                if(nStr == alpa[i]){
                    answer[sort] = strings[j];
                    sort++;
                }
            }
        }
        return answer;
    }
}
