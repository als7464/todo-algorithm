package level2;
//프린터
// url : https://school.programmers.co.kr/learn/courses/30/lessons/42587

import java.util.*;

public class Printer {

    public static void main(String[] args) {
        System.out.println(Solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
        System.out.println(Solution(new int[]{2, 1, 3, 2}, 2));
    }

  private static int Solution(int[] ints, int location) {
        int answer = 0;
        int max =0;
        Queue<HashMap<Integer,Integer>> queue = new LinkedList<>();
        ArrayList<Integer> maxList = new ArrayList<>();

        for(int i=0; i<ints.length; i++){
            //대기목록 추가
            //location 비교 하기위해 map에 담아서 queue 에 저장
            HashMap<Integer,Integer> nMap = new HashMap<Integer,Integer>();
            nMap.put(i,ints[i]);
            queue.add(nMap);
            maxList.add(ints[i]);
        }
        //최대값 정렬
        Collections.sort(maxList,Collections.reverseOrder());
        int cnt = 1;
        while(!queue.isEmpty()){
            HashMap<Integer,Integer> nMap = queue.remove();
            //최대값 가져올때 위치(0부터 시작)
            if(nMap.containsValue(maxList.get(cnt-1))){
                // 뺀값의 키값이랑 location 같을때
                if(nMap.containsKey(location)){
                    // 카운트 return!
                    return cnt;
                }else{
                    // 아닌경우에는 카운트 증가
                    cnt++;
                }
            }else{
                //다른경우 nMap에 다시 queue에 저장
                queue.add(nMap);
            }
        }
        return answer;
    }
}

