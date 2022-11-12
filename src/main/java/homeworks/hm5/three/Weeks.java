package homeworks.hm5.three;

import java.util.ArrayList;
import java.util.List;

public class Weeks {

    private static List<String> days = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
             "Saturday", "Sunday");

    public static boolean contains(String day) {

        return days.contains(day) ? true : false;
    }
}