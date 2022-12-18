package homeworks.homeworkEigth.task3;

import java.util.ArrayList;
import java.util.Optional;

public class UniqueList implements MyList {

    ArrayList<Integer> uniqueArrayList = new ArrayList<>();

    @Override
    public void add(int val) {
        if (!contains(val)) {
            uniqueArrayList.add(val);
        } else {
            System.out.println("такой элемент уже есть в листе");
        }
    }

    @Override
    public int get(int index) {
        return uniqueArrayList.get(index);
    }

    @Override
    public int size() {
        return uniqueArrayList.size();
    }

    @Override
    public boolean contains(int val) {
        Optional<Integer> first = uniqueArrayList.stream()
                .filter(v -> v.equals(val))
                .findFirst();
        return first.isPresent();
    }
}
