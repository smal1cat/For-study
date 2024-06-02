/*n보다 커질 때까지 더하기*/
class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i=0;i<numbers.length;i++){
            answer += numbers[i];
            if(answer>n){
                break;
            }
        }
        return answer;
    }
}