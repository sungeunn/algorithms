import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        Map<Integer, Integer> arrayMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            arrayMap.put(array[i], i);
        }
        
        Arrays.sort(array);
        
        answer[0] = array[array.length - 1];
        answer[1] = arrayMap.get(answer[0]);
        
        return answer;
    }
}