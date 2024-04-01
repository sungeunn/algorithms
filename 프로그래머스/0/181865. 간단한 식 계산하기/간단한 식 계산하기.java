class Solution {
    public int solution(String binomial) {
        String[] strArray = binomial.split(" ");
        
        if (strArray[1].equals("+")) {
            return (Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[2]));
        } else if (strArray[1].equals("-")) {
            return (Integer.parseInt(strArray[0]) - Integer.parseInt(strArray[2]));
        } else {
            return (Integer.parseInt(strArray[0]) * Integer.parseInt(strArray[2]));
        }
        
    }
}