// 수 조작하기
class Solution {
    public int solution(int n, String control) {

        int answer = 0;
        char [] array = control.toCharArray();

        for(int i=0; i<control.length(); i++){
            if(array[i]=='w'){
                n+=1;
            } else if(array[i]=='s'){
                n-=1;
            } else if(array[i]=='d'){
                n+=10;
            } else if(array[i]=='a'){
                n-=10;
            }
        }
        answer=n;
        return answer;
    }
}

//이어 붙인 수
class Solution {
    public int solution(int[] num_list) {
      String oddN = "";
        String evenN = "";
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==1){
                oddN += Integer.toString(num_list[i]);
            }else{
                evenN += Integer.toString(num_list[i]);
            }
        }
        int Sum1 = Integer.parseInt(oddN);
        int Sum2 = Integer.parseInt(evenN);
        
        return Sum1 + Sum2;
    }
}