import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> count = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count.add(i);
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        
        if (!count.isEmpty()) {
            for (int i = count.get(0); i <= count.get(count.size() - 1); i++) {
                answer.add(arr[i]);
            }
        } else {
            answer.add(-1);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}