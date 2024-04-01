import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> answer = new TreeSet<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    answer.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}