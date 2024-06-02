/*간단한 논리 연산*/
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean result = (x1 || x2) && (x3 || x4);
        answer = result;
        
        return answer;
    }
}


/*접미사 배열, 접미사와 접두사 개념만 알고 실제 코드는 처음짜봐서 다른
 사람 코드 참조해서 풀었음*/
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] suffixes = new String[length];

        // 모든 접미사 생성
        for (int i = 0; i < length; i++) {
            suffixes[i] = my_string.substring(i);
        }

        // 접미사 배열을 사전순으로 정렬
        Arrays.sort(suffixes);

        return suffixes;
    }
}