import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int answer = array[0];
        int min = Math.abs(n - array[0]);
        for (int num : array) {
            int abs = Math.abs(n - num);
            if (abs < min) {
                min = abs;
                answer = num;
            }
        }
        
        return answer;
    }
}