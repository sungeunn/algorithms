import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sortArray = emergency.clone();
        Arrays.sort(sortArray);
        
        Map<Integer, Integer> sortMap = new HashMap<>();
        for (int i = 0; i < sortArray.length; i++) {
            sortMap.put(sortArray[i], sortArray.length - i);
        }
        
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = sortMap.get(emergency[i]);
        }
        
        return answer;
    }
}