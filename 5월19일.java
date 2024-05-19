/* 9로 나눈 나머지*/
class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        String[] numbox = number.split("");
        for (int i = 0; i < numbox.length; i++) {
            sum += Integer.parseInt(numbox[i]);
        }
        answer = sum % 9;
        return answer;
    }
}