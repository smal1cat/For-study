/*가까운 1찾기*/
class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i =idx ;i<arr.length;i++){  // int i =idx인 이유는 idx이후의 숫자만 찾기 때문에
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}


/*qr code 문제*/

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";

        for(int i = 0; i < code.length(); i ++)
            if(i % q == r){
                answer += code.charAt(i);
            }
        }
        return answer;
    }