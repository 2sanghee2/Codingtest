import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=(int)(Math.log10(n)+1); i>=0; i--){
        answer+=(int)n%10;
        n=n/10;
        }
        return answer;
    }
}