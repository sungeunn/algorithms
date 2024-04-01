class Solution {
    boolean solution(String s) {
        String lowerStr = s.toLowerCase();
        char[] charArray = lowerStr.toCharArray();
        
        int sumOfP = 0;
        int sumOfY = 0;
        for (char ch : charArray) {
            if (ch == 'p') {
                sumOfP++;
            } else if (ch == 'y') {
                sumOfY++;
            }
        }
        
        if (sumOfP != sumOfY) {
            return false;
        }

        return true;
    }
}