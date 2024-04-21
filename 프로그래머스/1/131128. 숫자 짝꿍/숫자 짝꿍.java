import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answerBuilder = new StringBuilder();
        
        List<Integer> containsList = new ArrayList<>();
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char ch : Y.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : X.toCharArray()) {
            if (charCountMap.containsKey(ch) && charCountMap.get(ch) > 0) {
                containsList.add(Character.getNumericValue(ch));
                charCountMap.put(ch, charCountMap.get(ch) - 1);
            }
        }
        
        if (containsList.isEmpty()) {
            return "-1";
        }
        
        if (containsList.stream().allMatch(num -> num == 0)) {
            return "0";
        }

        Collections.sort(containsList, Collections.reverseOrder());
        for (int num : containsList) {
            answerBuilder.append(num);
        }

        return answerBuilder.toString();
    }
}