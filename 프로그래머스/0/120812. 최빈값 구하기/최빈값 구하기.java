class Solution {
    public int solution(int[] array) {
        int answer = 0;
                
        int[] count = new int[1001];
        
        int mode = 0;
        int modeCount = 0;
        
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
            
            if (count[array[i]] > modeCount) {
                mode = array[i];
                modeCount = count[array[i]];
            }
        }
        
        boolean isDuplicate = false;
        for (int i = 0; i < 1001; i++) {
            if (i != mode && count[i] == modeCount) {
                isDuplicate = true;
                break;
            }
        }
        answer=isDuplicate ? -1 : mode;
        return answer;
    }
}