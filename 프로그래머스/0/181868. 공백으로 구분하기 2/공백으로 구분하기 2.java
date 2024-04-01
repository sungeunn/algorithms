import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        
        String[] strArr = my_string.split(" ");
        
        List<String> answer = new ArrayList<>();
        
        for (String str : strArr) {
            if (!str.equals("")) {
                answer.add(str);
            }
        }
        
        return  answer.toArray(new String[0]);
    }
}