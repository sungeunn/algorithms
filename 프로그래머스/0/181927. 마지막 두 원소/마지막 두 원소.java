class Solution {
    public int[] solution(int[] num_list) {
        
        int[] answer = new int[num_list.length + 1];
        
        for(int i = 0 ; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        int last = num_list[num_list.length - 1];
        int before = num_list[num_list.length - 2];
        
        if (last > before) {
            answer[num_list.length] = last - before;
        } else {
            answer[num_list.length] = last * 2;
        }
        
        return answer;
    }
}