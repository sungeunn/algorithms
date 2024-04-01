import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        int[] sortedArray = Arrays.stream(score)
                .boxed()
                .sorted((a, b) -> Integer.compare(b, a))
                .mapToInt(Integer::intValue)
                .toArray();
        
        List<Integer> scoreList = new ArrayList<>();
        for (int i : sortedArray) {
            scoreList.add(i);
        }
        
        for (int i = 0; i < scoreList.size(); i += m) {
            int endIndex = Math.min(i + m, scoreList.size());
            List<Integer> subList = scoreList.subList(i, endIndex);
            if (subList.size() == m) {
                answer += subList.get(subList.size() - 1) * m;
            }
        }
            
        return answer;
    }
}