package java8.quest.chatgpt.localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Date {
    public static void main(String[] args) {
        //    Create a LocalDate object representing the current date.
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //    Given a specific date, add 3 months and 5 days to it.
        LocalDate newDate = LocalDate.now().plusMonths(3).plusDays(5);
        System.out.println(newDate);

        //    Calculate the duration between two LocalDateTime objects.
        Period period = Period.between(today,newDate);
        System.out.println("Years : " + period.getYears()
                        + ", Months : " + period.getMonths()
                        + ", Days : " + period.getDays());
    }
}
