import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

public class MainEx29 {
    public static void main(String[] args) {
        String string = "May 1, 2016";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println();
        System.out.println(date);
        System.out.println();
    }
}
