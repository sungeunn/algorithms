import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        List<String> playerList = new ArrayList<>(Arrays.asList(players));
        Map<String, Integer> playerIndexMap = new HashMap<>();

        for (int i = 0; i < playerList.size(); i++) {
            playerIndexMap.put(playerList.get(i), i);
        }

        for (String calling : callings) {
            int currentIndex = playerIndexMap.get(calling);
            if (currentIndex != 0) {
                Collections.swap(playerList, currentIndex, currentIndex - 1);
                playerIndexMap.put(playerList.get(currentIndex), currentIndex);
                playerIndexMap.put(playerList.get(currentIndex - 1), currentIndex - 1);
            }
        }
        
        return playerList.toArray(new String[0]);
    }
}