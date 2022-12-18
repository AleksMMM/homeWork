package homeworks.homeworkEigth.task2;

import lombok.Data;

@Data
public abstract class Car implements Run {

    private String name;
    protected int maxPered;
    protected int tecPered;

    public Car(String name, int maxPered, int tecPered) {
        this.name = name;
        this.maxPered = maxPered;
        this.tecPered = tecPered;
    }
}
