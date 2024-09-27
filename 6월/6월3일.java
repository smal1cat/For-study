/*n개 간격의 원소들*/
class Solution {
    public int[] solution(int[] num_list, int n) {
    
        int[] answer;
        
       // 배열의 길이가 짝수/홀수에 따라 새로운 길이의 배열을 생성 
        if (num_list.length % n == 0) {
            answer = new int[num_list.length / n];
        } else {
            answer = new int[num_list.length / n + 1];
        }
        
        int index = 0;
        
        for (int i = 0; i < num_list.length; i+=n) {
            answer[index++] = num_list[i];  //index++를 통해서 0부터 계속 배열길이 만큼 더해짐
        }
        
        return answer;
    }
}