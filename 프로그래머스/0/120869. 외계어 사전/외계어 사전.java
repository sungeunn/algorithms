import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        String sortedSpell = String.join("", spell);
        
        for (String str : dic) {
            char[] chArray = str.toCharArray();
            Arrays.sort(chArray);
            String sortedStr = new String(chArray);
            
            if (sortedSpell.equals(sortedStr)) {
                return 1;
            }
        }
        
        return 2;
    }
}