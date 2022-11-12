package homeworks.hm5.three;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainRunner {


    @SneakyThrows
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Service service = new Service();
        String plan;
        String day;

        while (true) {

            System.out.println("Чтобы ввести новый план введите 1");
            System.out.println("Чтобы вывести все планы введите 2");
            System.out.println("Чтобы вывести все планы на определенный день введите 3");
            System.out.println("Чтобы выйти введите 4");

            String count = bufferedReader.readLine();

            switch (count) {
                case "1":

                    System.out.println("Введите день недели для добавления плана");
                    day = bufferedReader.readLine();

                    if (Weeks.contains(day)) {

                        System.out.println("Введите план на день");
                        plan = bufferedReader.readLine();

                        service.addPlain(day, plan);

                    } else {
                        throw new DaysNotException("this day not day");
                    }
                    break;
                case "2":

                    service.getAllPlan();
                    break;
                case "3":

                    day = bufferedReader.readLine();

                    if (Weeks.contains(day)) {
                        service.getPlanDay(day);

                    } else {
                        System.out.println("not this day");
                    }
                    break;
                case "4":
                    return;

            }


        }
    }
}
