import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            sum += Character.getNumericValue(ch[i]);
        }

        return sum;
    }
}