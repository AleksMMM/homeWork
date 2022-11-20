package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainRunner {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("volvo", 1990));
        carList.add(new Car("gaz", 2020));
        carList.add(new Car("mers", 2008));
        carList.add(new Car("lada", 2012));
        carList.add(new Car("vw", 2018));

        Collections.sort(carList, new SortByYear());

        carList.forEach(System.out::println);

        Collections.sort(carList, new SortByModel());

        carList.forEach(System.out::println);
    }
}
