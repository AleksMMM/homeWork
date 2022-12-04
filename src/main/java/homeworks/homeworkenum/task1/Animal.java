package homeworks.homeworkenum.task1;

public abstract class Animal {

    protected String animalType;
    protected String name;

    public Animal(String animalType, String name) {
        this.animalType = animalType;
        this.name = name;
    }

    public abstract void animalSay();
}
