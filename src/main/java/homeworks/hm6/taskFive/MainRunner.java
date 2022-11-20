package homeworks.hm6.taskFive;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задача 4 Вы хотите написать метод, который считывает с консоли номер банковской карты.
 * По правилам, длина номера должна быть 5 символов.
 * Первый символ номера должна быть буква i
 * Последний символ номера должан быть буква d.
 * Промежуточные символы могут быть любыми - числа или буквы
 * Например: i123d или iac3d
 * Если юзер ввел номер правильно, метод должен вывести на консоль фразу "Корректно". Больше ничего выводить не требуется.
 * Если юзер ввел номер неправильно, вам нужно вызвать метод рекурсивно, чтобы начать вторую попытку и т.д.
 */
public class MainRunner {

    public static void main(String[] args) throws IOException {

        enterNumberCard();
    }

    public static void enterNumberCard() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите номер карты длина 5, номер должен начинаться на i и заканчиваться на d");
        String cardNumber = bf.readLine();

        if (cardNumber.length() == 5) {

            if (cardNumber.startsWith("i") && cardNumber.endsWith("d")) {
                System.out.println("Корректно");
            } else {
                enterNumberCard();
            }


        } else {
            enterNumberCard();
        }
    }
}
