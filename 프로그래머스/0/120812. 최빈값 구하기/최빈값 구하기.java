import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        int maxCount = 0;
        int answer = 0;
        boolean duplication = false;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            
            if (count > maxCount) {
                maxCount = count;
                answer = key;
                duplication = false;
            } else if (count == maxCount) {
                duplication = true;
            }
        }
        
        if (duplication) {
            return -1;
        }
        
        return answer;
    }
}