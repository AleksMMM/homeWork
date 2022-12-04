package homeworks.homeworkenum.task1;

public class Cow extends Animal {

    public Cow(String animalType, String name) {
        super(animalType, name);
    }

    @Override
    public void animalSay() {
        System.out.println("Муу! " + name);
    }
}
