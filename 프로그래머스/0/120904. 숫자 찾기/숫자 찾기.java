class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        
        if (str.indexOf(Integer.toString(k)) == -1) {
            return -1;
        }
        
        return str.indexOf(Integer.toString(k)) + 1;
    }
}