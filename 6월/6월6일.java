/*내적*/
class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int[] sum = new int[a.length];
        for(int i=0;i<a.length;i++){
            answer += a[i] * b[i];
        }
        
        return answer;
    }
}

/*음양 더하기*/
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i =0;i<absolutes.length;i++){
            if(signs[i]==true){
                answer += absolutes[i];
            }else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}