class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        
        long kLong = (long) k;
        long dLong = (long) d;

        for (long x = 0; x <= dLong; x += kLong) {
            long maxY = (long) Math.sqrt(dLong * dLong - x * x);
            answer += (maxY / kLong) + 1;
        }
        
        return answer;
    }
}