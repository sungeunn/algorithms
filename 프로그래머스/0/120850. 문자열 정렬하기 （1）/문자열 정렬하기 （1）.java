import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                numList.add(Character.getNumericValue(ch));
            }
        }

        Collections.sort(numList);
        
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}