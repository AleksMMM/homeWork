package homeworks.homeworkEigth.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AutoCar extends Car {

    public AutoCar(String name, int maxPered, int tecPered) {
        super(name, maxPered, tecPered);
    }

    @Override
    public void breakCar() {
        if (tecPered != 0) {
            tecPered--;
            System.out.println("текущая передача у машины " + getName() + " равна " + tecPered);
        } else {
            System.out.println("милорд передача равна нулю у машины " + getName());
        }

    }

    @Override
    public void gasCar() {
        if (tecPered != maxPered) {
            tecPered++;
            System.out.println("текущая передача у машины " + getName() + " равна " + tecPered);
        } else {
            System.out.println("милорд макс передача");
        }
    }
}
