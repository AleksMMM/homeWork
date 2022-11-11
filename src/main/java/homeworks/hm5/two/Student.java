package homeworks.hm5.two;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Student {

    private String name;
    private String surName;
    List<Subject> subjectList = new ArrayList<>();

    public boolean add(Subject subject) {

        if (Correct.correctPredmet(subject.getName()) &&
            Correct.correctBall(subject.getMark())) {
            subjectList.add(subject);
            return true;
        }

        return false;
    }

    public double getAverageMark() {
        double sum = this.subjectList
                .stream()
                .mapToDouble(v -> v.getMark())
                .sum();

        return sum / this.subjectList.size();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }

    public void printInfo() {
        this.toString();
    }
}