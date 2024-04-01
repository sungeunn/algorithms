class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        
        char[] ch = myString.toCharArray();
        for (int i = 0; i < myString.length(); i++) {
            if (ch[i] == 'A') {
                answer += "B";
            } else {
                answer += "A";
            }
        }
        
        if (answer.contains(pat)) {
            return 1;
        }
        
        return 0;
    }
}