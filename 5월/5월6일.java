// 카운트업 문제
class Solution {
    public int[] solution(int start_num, int end_num) {
        
        int[] answer = new int[end_num - start_num + 1];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num;
            start_num++;
        }

        return answer;
    }
}

//마지막 두 원소 문제
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int sum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            sum = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        } else {
            sum = num_list[num_list.length - 1] * 2;
        }
        
        answer[answer.length - 1] = sum;
        return answer;
    }
}