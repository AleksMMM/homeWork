package homeworks.hm6.taskTwo;

public class MainRunner {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        arrReverse(arr, arr.length - 1);
    }

    public static void arrReverse(int[] array, int count) {

        if (count >= 0) {
            System.out.print(array[count] + " ");
            count--;
            arrReverse(array, count);
        }
    }


}
