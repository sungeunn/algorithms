import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<List<Integer>> answerList = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            List<Integer> dataList = new ArrayList<>();
            for (int j = 0; j < data[i].length; j++) {
                if (ext.equals("code") && data[i][0] < val_ext) {
                    dataList.add(data[i][j]);
                } else if (ext.equals("date") && data[i][1] < val_ext) {
                    dataList.add(data[i][j]);
                } else if (ext.equals("maximum") && data[i][2] < val_ext) {
                    dataList.add(data[i][j]);
                } else if (ext.equals("remain") && data[i][3] < val_ext) {
                    dataList.add(data[i][j]);
                }
            }
            
            if (dataList.size() > 0) {
                answerList.add(dataList);
            }
        }
        
        for (int i = 0; i < answerList.size(); i++) {
            if (sort_by.equals("code")) {
                answerList.sort((o1, o2) -> {
                    return o1.get(0) - o2.get(0);
                });
            } else if (sort_by.equals("date")) {
                answerList.sort((o1, o2) -> {
                    return o1.get(1) - o2.get(1);
                });
            } else if (sort_by.equals("maximum")) {
                answerList.sort((o1, o2) -> {
                    return o1.get(2) - o2.get(2);
                });
            } else if (sort_by.equals("remain")) {
                answerList.sort((o1, o2) -> {
                    return o1.get(3) - o2.get(3);
                });
            }
        }
        
        int[][] answer = new int[answerList.size()][];
        for (int i = 0; i < answerList.size(); i++) {
            List<Integer> list = answerList.get(i);
            answer[i] = new int[list.size()];
            for (int j = 0; j < list.size(); j++) {
                answer[i][j] = list.get(j);
            }
        }
        
        return answer;
    }
}