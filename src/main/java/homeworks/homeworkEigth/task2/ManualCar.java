package homeworks.homeworkEigth.task2;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ManualCar extends Car {


    public ManualCar(String name, int maxPered, int tecPered) {
        super(name, maxPered, tecPered);
    }

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    @Override
    @SneakyThrows
    public void breakCar() {
        System.out.println("Введите передачу на которую хотите переключиться так как скорость снизилась");
        int pered = Integer.parseInt(bf.readLine());
        if (pered > tecPered) {
            System.out.println("милорд мы едем медленнее передачу надо понижать, текущая передача " + tecPered);
            pered = Integer.parseInt(bf.readLine());
            tecPered = pered;
        } else if(tecPered == 0) {
            System.out.println("милорд ниже не куда");
            return;
        } else if(pered < 0) {
            System.out.println("не шути со мной больной ублюдок");
            return;
        }
        tecPered = pered;
        System.out.println("текущая передача у машины " + getName() + " равна " + tecPered);
    }

    @Override
    @SneakyThrows
    public void gasCar() {
        System.out.println("Введите передачу на которую хотите переключиться так как скорость выросла");
        int pered = Integer.parseInt(bf.readLine());
        if (pered <= tecPered) {
            System.out.println("милорд скорость возрастает прошу переключиться на передачу выше передачи " + tecPered);
            pered = Integer.parseInt(bf.readLine());
        } else if(pered >= maxPered && tecPered == maxPered) {
            System.out.println("милорд мы уже на максимальной передаче " + tecPered);
            return;
        }
        tecPered = pered;
        System.out.println("текущая передача у машины " + getName() + " равна " + tecPered);
    }
}
