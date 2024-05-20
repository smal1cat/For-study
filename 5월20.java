/* 카운트 다운*/
class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num +1];
        
        for(int i=0;i<answer.length;i++){
            answer[i] = start - i;
        }  
        return answer;
    }
}

/*배열 만들기 2-1 내가 풀어본 것. 
코드 실행은 되나 사용하기에는 부적합을 받음*/

class Solution {
    public int[] solution(int l, int r) {
        int count = 0;
        for (int i = l; i <= r; i++) {
            if (isValidNumber(i)) {
                count++;
            }
        }

        int[] answer = new int[count];
        int index = 0;
        for (int i = l; i <= r; i++) {
            if (isValidNumber(i)) {
                answer[index++] = i;
            }
        }

        if (count == 0) {
            return new int[]{-1};
        }
        return answer;
    }

    private boolean isValidNumber(int num) {
        int ones = num % 10;
        int tens = (num / 10) % 10;
        int hundreds = (num / 100) % 10;
        return (ones == 0 || ones == 5) && (tens == 0 || tens == 5) && (hundreds == 0 || hundreds == 5);
    }
}


/*실행과 적합 판정을 받은 코드(정답 코드)
이 코드를 참고하고 공부하여 혼자서 풀수 있게 연습하기.*/
import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        int a = 0;
        for(int i = l; i <= r; i++) {
            String num =  String.valueOf(i);
            String[] nums = num.split("");
            int numLength =  nums.length;
            int count = 0;
                for (int j = 0; j < numLength; j++) {
                    if (nums[j].equals("0") || nums[j].equals("5")) {
                        count++;
                    }
                }
                if(count == numLength) {
                    list.add(i);
                }
            }
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        if(answer.length == 0) {
           answer = new int[] {-1};
            return answer;
        }
        return answer;
    }
}