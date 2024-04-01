import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        
        for (String str : str_list) {
            answer.add(str);
        }
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                return answer.subList(0, i).toArray(new String[0]);
            } else if (str_list[i].equals("r")) {
                return answer.subList(i+1, str_list.length).toArray(new String[0]);
            }
        }
        
        return new String[]{};
    }
}