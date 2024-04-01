import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {        
        List<String> nameList = new ArrayList<>(Arrays.asList(name));
        Map<String, Integer> missMap = new LinkedHashMap<>();
        
        for (int i = 0; i < nameList.size(); i++) {
            missMap.put(nameList.get(i), yearning[i]);
        }
        
        List<Integer> result = new ArrayList<>();
        for (String[] photoList : photo) {
            int missSum = 0;
            for(String photoName : photoList) {
                if (missMap.get(photoName) != null) {
                    missSum += missMap.get(photoName);
                }
            }
            result.add(missSum);
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}