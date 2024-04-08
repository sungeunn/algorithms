import java.util.*;

class Solution {
    public long solution(long n) {
        String answer = "";
        
        char[] chArray = Long.toString(n).toCharArray();
        Arrays.sort(chArray);
        
        for (int i = chArray.length - 1; i >= 0; i--) {
            answer += chArray[i];
        }
        
        return Long.parseLong(answer);
    }
}