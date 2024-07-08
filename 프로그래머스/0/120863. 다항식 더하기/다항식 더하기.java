class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        int countX = 0;
        int sum = 0;
        String[] strArray = polynomial.split(" \\+ ");
        for (String str : strArray) {
            if (str.contains("x")) {
                if (str.length() > 1) {
                    String num = str.replace("x", "");
                    countX += Integer.parseInt(num);
                } else {
                    countX++;
                }
            } else {
                sum += Integer.parseInt(str);
            }
        }
        
        if (countX > 0 && sum > 0) {
            if (countX == 1) {
                answer = "x + " + sum;
            } else {
                answer = countX + "x + " + sum;
            }
        } else if (countX > 0) {
            if (countX == 1) {
                answer = "x";
            } else {
                answer = countX + "x";
            }
        } else {
            answer = String.valueOf(sum);
        }
        
        return answer;
    }
}