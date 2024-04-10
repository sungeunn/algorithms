import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate date = LocalDate.parse(today, formatter);
        
        for (String term : terms) {
            for (int i = 0; i < privacies.length; i++) {
                if (privacies[i].charAt(11) == term.charAt(0)) {
                    String priStr = privacies[i].substring(0, 10);
                    String[] spMonth = term.split("\\s+");
                    int plusMonthsNum = Integer.parseInt(spMonth[1]);
                    LocalDate priDate = LocalDate.parse(priStr, formatter).plusMonths(plusMonthsNum);
                    if (date.compareTo(priDate) >= 0) {
                        answer.add(i + 1);
                    }
                }
            }
        }
        Collections.sort(answer);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}