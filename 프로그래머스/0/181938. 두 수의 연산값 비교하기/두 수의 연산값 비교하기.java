class Solution {
    public int solution(int a, int b) {
        int i1 = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        
        return (i1 >= (2*a*b)) ? i1 : (2*a*b);
    }
}