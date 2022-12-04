package homeworks.homeworkenum.task1;

public class Dog extends Animal {

    public Dog(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    public void animalSay() {
        System.out.println("Гав! " + name);
    }
}
