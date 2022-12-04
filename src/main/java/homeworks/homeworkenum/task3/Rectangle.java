package homeworks.homeworkenum.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rectangle {

    private Color color;
    private int a;
    private int b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a && b == rectangle.b && color == rectangle.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, a, b);
    }
}
