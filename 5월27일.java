/*n번째 원소까지*/
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
     
        for(int i=0;i<n;i++){
            answer[i] = num_list[i];
           
        }
        return answer;
    }
}

/*수박수박?*/
class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i=0;i<n;i++){
            if(i%2==0){
                 answer += "수"; 
            }else{
                answer +="박";
            }
        }
        return answer;
    }
}