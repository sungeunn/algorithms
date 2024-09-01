class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        String str = "";
        for (int l = i; l <= j; l++) {
            str += l;
        }
        
        for (char ch : str.toCharArray()) {
            if (String.valueOf(ch).equals(String.valueOf(k))) {
                answer++;
            }
        }
        
        return answer;
    }
}