package homeworks.hm6;

import java.util.ArrayList;
import java.util.List;

public class Main31 {

    public static void main(String[] args) {

        List<String> listName = new ArrayList<>();
        listName.add(null);
        listName.add("Jho");
        listName.add(null);
        listName.add("Andrew");
        listName.add("Den");
        listName.add(null);

        notNullGuest(listName, 0);

    }

    public static void notNullGuest(List<String> list, int count) {
        if (list.size() > count) {
            if (list.get(count) != null) {
                System.out.print(list.get(count) + " ");
            }
            notNullGuest(list, count + 1);
        }
    }
}
