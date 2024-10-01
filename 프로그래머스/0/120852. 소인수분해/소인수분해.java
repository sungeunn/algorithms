import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> answer = new LinkedHashSet<>();
        
        while (n % 2 == 0) {
            answer.add(2);
            n /= 2;
        }
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                answer.add(i);
                n /= i;
            }
        }
        
        if (n > 2) {
            answer.add(n);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}