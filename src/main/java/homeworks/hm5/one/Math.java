package homeworks.hm5.one;

public class Math {

    private static final double PI = 3.14;

    public static double pow(double value, int step) {


        double result = value;

        while (step != 1) {
            result = result * value;
            step--;
        }

        return result;
    }

    public static double abs(double value) {

            return value < 0 ? -value: value;
        }

    public static double getCircleSquare(double r) {
        return 2 * PI * r;
    }
    }


