import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        Map<Character, Integer> chMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            chMap.put(ch, chMap.getOrDefault(ch, 0) + 1);
        }
        
        List<Character> chList = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (chMap.get(ch) == 1) {
                chList.add(ch);
            }
        }
        
        Collections.sort(chList);
        
        for (char ch : chList) {
            answer += ch;
        }
        
        return answer;
    }
}