import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] strArray = myString.split("x", -1);
        List<Integer> answer = new ArrayList<>();
        
        for (String str : strArray) {
            answer.add(str.length());
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}