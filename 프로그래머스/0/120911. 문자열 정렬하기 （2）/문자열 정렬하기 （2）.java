import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] chArray = my_string.toLowerCase().toCharArray();

        Arrays.sort(chArray);
        
        return new String(chArray);
    }
}