import java.time.*;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);      
        DayOfWeek dayOfWeek = date.getDayOfWeek();   
        int dayOfWeekNumber = dayOfWeek.getValue();
        
        String[] weekArray = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        for (int i = 1; i < 8; i++) {
            if (i == dayOfWeekNumber) {
                return weekArray[i-1];
            }
        }
        
        return "";
    }
}