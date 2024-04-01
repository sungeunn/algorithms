class Solution {
    public int solution(int a, int b) {
        int i1 = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int i2 = Integer.parseInt(Integer.toString(b)+Integer.toString(a));
        
        return (i1 >= i2) ? i1 : i2;
    }
}