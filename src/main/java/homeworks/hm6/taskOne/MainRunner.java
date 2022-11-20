package homeworks.hm6.taskOne;

public class MainRunner {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        arrSout(arr, 0);
    }

    public static void arrSout(int[] arr, int count) {

        if (count < arr.length) {
            System.out.print(arr[count] + " ");
            ++count;
            arrSout(arr, count);
        }
    }
}
