/* 문자열 섞기*/
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i=0;i<str1.length();i++){
            answer += String.valueOf(str1.charAt(i))+str2.charAt(i);
        }
        
        return answer;
    }
}


/* 수 조작하기 2*/
class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
                 if((numLog[i] - numLog[i-1]) == 1){
                 answer += "w";
            }
			else if((numLog[i] - numLog[i-1]) == -1){
                answer += "s";
            } 
			else if((numLog[i] - numLog[i-1]) == 10) {
                answer += "d";
            }
			else if((numLog[i] - numLog[i-1]) == -10) {
                answer += "a";
            }      
		}
        return answer;
    }
}