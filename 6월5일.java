/*부족한 금액 계산하기*/
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long result = 0;  //여기가 long인 이유는 int로하면 오버플로우가 일어날수 있기 때문이다.
        for(int i =0;i<=count;i++){
           result += i * price;
            answer = result - money;
            if(result<money){
                answer = 0;
            }
        }
        return answer;
    }
}