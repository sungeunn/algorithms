import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        Map<Integer, Integer> numMap = new LinkedHashMap<>();
        for (int num : numlist) {
            numMap.put(num, Math.abs(num - n));
        }
        
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(numMap.entrySet());
        entryList.sort((entry1, entry2) -> {
            int compare = entry1.getValue().compareTo(entry2.getValue());
            if (compare == 0) {
                return entry2.getKey().compareTo(entry1.getKey());
            }
            return compare;
        });
        
        for (int i = 0; i < entryList.size(); i++) {
            answer[i] = entryList.get(i).getKey();
        }
        
        return answer;
    }
}