package homeworks.hm5.two;

import java.util.List;

public class Correct {

    private static List<String> predmet = List.of("русский", "математика", "физика");
    private static List<Integer> ball = List.of(1, 2, 3, 4, 5);

    public static boolean correctPredmet(String value) {
       return predmet.contains(value);
    }

    public static boolean correctBall(int value) {
        return ball.contains(value);
    }
}