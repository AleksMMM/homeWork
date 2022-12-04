package homeworks.homeworkenum.task1;

public class Cat extends Animal {

    public Cat(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    public void animalSay() {
        System.out.println("Мяу! " + name);
    }
}
