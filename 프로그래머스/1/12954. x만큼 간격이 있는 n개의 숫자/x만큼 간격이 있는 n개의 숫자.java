import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        
        for (long i = 1; i < (n+1); i++) {
            long l = i * x;
            answer.add(l);
        }
        
        return answer.stream().mapToLong(Long::longValue).toArray();
    }
}