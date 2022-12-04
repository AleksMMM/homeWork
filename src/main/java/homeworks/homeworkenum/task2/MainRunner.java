package homeworks.homeworkenum.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainRunner {

    public static void main(String[] args) throws IOException {

        List<Card> cards = new ArrayList<>();

        cards.add(new MainRunner().addSillyCard());
        cards.add(new MainRunner().addSillyCard());
        cards.add(new MainRunner().addSillyCard());
        cards.add(new MainRunner().addSmartCard());
        cards.add(new MainRunner().addSmartCard());
        cards.add(new MainRunner().addSmartCard());

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <= 5 ; i++) {
            System.out.println(String.format("Раунд %d из 5", i));
            System.out.print("Игрок 1 введите номер карты: ");
            int readOne = Integer.parseInt(bf.readLine());
            System.out.println(readOne);
            System.out.print("Игрок 2 введите номер карты: ");
            int readTwo = Integer.parseInt(bf.readLine());
            System.out.println(readTwo);

            System.out.println( String.format("%s сила %d", cards.get(readOne).getClass().getSimpleName() , cards.get(readOne).value));
            System.out.println(String.format("%s сила %d", cards.get(readTwo).getClass().getSimpleName(), cards.get(readTwo).value));

            if (cards.get(readOne).value > cards.get(readTwo).value) {
                System.out.println("Побеждает игрок 1");
            } else if(cards.get(readOne).value < cards.get(readTwo).value) {
                System.out.println("Побеждает игрок 2");
            } else {
                System.out.println("Ничья");
            }
        }
    }

    public SillyCard addSillyCard() {

        String mast;
        int random = 1 + (int) ( Math.random() * 4 );

        if (random % 2 == 0) {
            mast = "пики";

        } else {
            mast = "крести";
        }

        return new SillyCard(random, mast);
    }

    public SmartCard addSmartCard() {

        String mast;
        int random = 1 + (int) ( Math.random() * 4 );

        if (random % 2 == 0) {
            mast = "пики";

        } else {
            mast = "крести";
        }

        return new SmartCard(random, mast);
    }
}