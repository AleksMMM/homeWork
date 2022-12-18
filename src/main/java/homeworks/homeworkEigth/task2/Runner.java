package homeworks.homeworkEigth.task2;

import homeworks.homeworkEigth.task2.auto.Almera;
import homeworks.homeworkEigth.task2.auto.Rio;
import homeworks.homeworkEigth.task2.manual.Charger;
import homeworks.homeworkEigth.task2.manual.Mustang;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Runner {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Rio("rio", 1));
        cars.add(new Almera("almera", 2));
        cars.add(new Charger("charger", 1));
        cars.add(new Mustang("Mustang", 1));

        System.out.println("повышаю передачу");
        cars.forEach(Run::breakCar);
        System.out.println("понижаю передачу");
        cars.forEach(Run::gasCar);

        System.out.println(new Runner().maxTecPered(cars));

    }

    public Car maxTecPered(List<Car> cars) {
        Car max = cars.stream().max((c , c2)-> c.tecPered - c2.tecPered).get();
        return max;
    }
}
