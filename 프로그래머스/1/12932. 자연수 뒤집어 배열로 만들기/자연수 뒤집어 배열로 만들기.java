import java.util.*;

class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        char[] chArray = str.toCharArray();
        
        List<Integer> answer = new ArrayList<>();
        for (char ch : chArray) {
            answer.add(Character.getNumericValue(ch));
        }
        Collections.reverse(answer);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}