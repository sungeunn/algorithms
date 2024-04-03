class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = Integer.toString(x);
        char[] charArray = str.toCharArray();
        
        int sum = 0;
        for(char ch : charArray) {
            int i = Character.getNumericValue(ch);
            sum += i;
        }
        
        if (x % sum != 0) {
            answer = false;
        }
        
        
        return answer;
    }
}