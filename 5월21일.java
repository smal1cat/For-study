/*원소들의 곱과 합*/
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int plus = 0;
        int mul = 1;
        
        for(int i =0;i<num_list.length;i++){
            plus += num_list[i];
            mul *= num_list[i];
        }
        if(plus *plus>mul){
            answer =1;
        }else {
            answer =0;
        }
        return answer;
    }
}