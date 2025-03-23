class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0, idx2 = 0;
        int len1 = cards1.length, len2 = cards2.length;

        for (String word : goal) {
            if (idx1 < len1 && cards1[idx1].equals(word)) {
                idx1++;
            } else if (idx2 < len2 && cards2[idx2].equals(word)) {
                idx2++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}