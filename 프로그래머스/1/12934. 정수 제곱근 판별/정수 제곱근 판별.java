class Solution {
    public long solution(long n) {
        double answer = Math.sqrt(n);
        
        if (answer > 0 && answer % 1 == 0.0) {
            return (long) ((answer+1) * (answer+1));
        }
        
        return -1;
    }
}