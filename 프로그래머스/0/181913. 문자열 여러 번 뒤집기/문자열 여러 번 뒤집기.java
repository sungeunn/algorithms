class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            
            String temp = answer.substring(start, (end + 1));
            StringBuffer sb = new StringBuffer(temp);
            String reverse = sb.reverse().toString();
            
            answer = answer.substring(0, start) + reverse + answer.substring(end + 1, my_string.length());
        }
        
        return answer;
    }
}
