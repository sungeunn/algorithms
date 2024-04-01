class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            for (int j = num_list[i]; j > 1; j /= 2) {
                if (num_list[i] % 2 == 0) {
                    count++;
                } else {
                    num_list[i] -= 1;
                    count++;
                }
            }
        }
        
        return count;
    }
}