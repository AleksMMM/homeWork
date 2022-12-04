package homeworks.homeworkenum.task1;

import java.util.ArrayList;
import java.util.List;

public class MainRunner {

    /**
     * Задача 1 Создать суперкласс Animal с полями:
     * private String animalType - тип животного
     * private String name - имя животного
     * Создать конструктор
     * создать метод
     * public void animalSay() - выводит на экран, что говорит животное по имени name
     * Создать подклассы:
     * Dog, Cat, Cow
     * В подклассах нужно переопределить метод animalSay, чтобы у собак методы выводили на экран "Гав!", у кошек "Мяу!", а у коров - "Муу!"
     * В мейне создать массив типа Animal, записать в массив по несколько объектов от каждого класса и вывести на экран название типа животного и что оно говорит
     */

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("cat", "barsik"));
        animals.add(new Dog("dog", "drug"));
        animals.add(new Cow("cow", "zorka"));

        animals.forEach(v -> v.animalSay());

    }
}
