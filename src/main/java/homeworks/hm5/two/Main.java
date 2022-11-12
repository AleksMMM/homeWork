package homeworks.hm5.two;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student studentOne = new Student("Ivan", "Ivanov");
        Student studentTwo = new Student("Aleksandrov", "Aleksandr");

        studentOne.add(new Subject("математика", 5));
        studentOne.add(new Subject("физика", 4));
        studentOne.add(new Subject("рус", 5));


        studentTwo.add(new Subject("математика", 5));
        studentTwo.add(new Subject("физика", 2));
        studentTwo.add(new Subject("рус", 5));

        studentOne.printInfo();
        studentTwo.printInfo();

        if (studentOne.getAverageMark() > studentTwo.getAverageMark()) {
            studentOne.printInfo();
        } else {
            studentTwo.printInfo();
        }
    }
}
