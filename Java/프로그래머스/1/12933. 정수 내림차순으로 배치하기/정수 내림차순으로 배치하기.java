import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        char[] digits = Long.toString(n).toCharArray();
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits)).reverse();
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}