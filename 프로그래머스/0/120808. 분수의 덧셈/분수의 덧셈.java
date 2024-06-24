class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int resultNumer = numer1 * denom2 + numer2 * denom1;
        int resultDenom = denom1 * denom2;
        
        int n = resultNumer;
        int d = resultDenom;
        
        while (d != 0) {
            int temp = d;
            d = n % d;
            n = temp;
        }

        resultNumer /= Math.abs(n);
        resultDenom /= Math.abs(n);
        
        answer[0] = resultNumer;
        answer[1] = resultDenom;
        
        return answer;
    }
}