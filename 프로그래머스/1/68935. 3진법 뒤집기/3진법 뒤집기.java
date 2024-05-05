class Solution {
    public int solution(int n) {
        String temp = "";
        while (n != 0) {
            temp += String.valueOf(n % 3);
            n = n / 3;
        }
        
        int decimal = 0;
        int power = 0;
        for (int i = temp.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(temp.charAt(i));
            decimal += digit * Math.pow(3, power);
            power++;
        }
        
        return decimal;
    }
}