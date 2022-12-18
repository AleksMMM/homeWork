package homeworks.homeworkEigth.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainRunner {

    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        MyList myList = null;
        System.out.println("введите какой лист хотите использовать");

        String s = bf.readLine();
        if (s.equals("1")) {
            myList = new UniqueList();
        }
        if (s.equals("2")) {
            myList = new NotUniqueList();
        }

        Service service = new Service(myList);
        System.out.println("выберите операцию");
        System.out.println("1. Добавить число\n" +
                "2. Вывести все числа\n" +
                "3. Выход");

        s = bf.readLine();
        if (s.equals("1")) {
            int value = Integer.parseInt(bf.readLine());
            service.getMyList().add(value);
        }
    }
}
