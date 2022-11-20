package homeworks.hm6;

import java.util.ArrayList;
import java.util.List;

public class Main33 {

    public static void main(String[] args) {

        List<String> listName = new ArrayList<>();
        listName.add("Mike");
        listName.add(null);
        listName.add("Jho");
        listName.add(null);
        listName.add("Andrew");
        listName.add("Den");
        listName.add(null);
        listName.add("Ken");
        notNullGuest(listName, listName.size());

    }

    public static void notNullGuest(List<String> list, int count) {
        if (count > 0) {
            notNullGuest(list, --count);
            if (list.get(count) != null) {
                System.out.print( list.get(count) + " ");
            }
        }
    }
}
