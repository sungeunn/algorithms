import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String morse = ".-:a,-...:b,-.-.:c,-..:d,.:e,..-.:f,--.:g,....:h,..:i,.---:j,-.-:k,.-..:l,--:m,-.:n,---:o,.--.:p,--.-:q,.-.:r,...:s,-:t,..-:u,...-:v,.--:w,-..-:x,-.--:y,--..:z";
        
        Map<String, String> morseMap = new HashMap<>();

        String[] splitMorse = morse.split(",");
        for (String str : splitMorse) {
            String[] strArray = str.split(":");
            morseMap.put(strArray[0], strArray[1]);
        }

        String[] splitLetter = letter.split(" ");
        for (String word : splitLetter) {
            answer += morseMap.get(word);
        }

        return answer;
    }
}