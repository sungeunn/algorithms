class Solution {
    public int solution(String my_string) {
        String[] strArray = my_string.split(" ");
        
        int answer = Integer.parseInt(strArray[0]);
        for (int i = 1; i < strArray.length; i += 2) {
            if (strArray[i].equals("+")) {
                answer += Integer.parseInt(strArray[i + 1]);
            } else {
                answer -= Integer.parseInt(strArray[i + 1]);
            }
        }
        
        return answer;
    }
}