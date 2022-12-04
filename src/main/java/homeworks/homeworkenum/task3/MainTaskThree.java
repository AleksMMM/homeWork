package homeworks.homeworkenum.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainTaskThree {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    List<Rectangle> rectangles = new ArrayList<>();

    public static void main(String[] args) throws IOException, NoColorException {

        MainTaskThree mtt = new MainTaskThree();
        int count = 0;

        while (count != 4) {
            System.out.println("1. Добавить фигуру");
            System.out.println("2. Вывести все фигуры определенного цвета");
            System.out.println("3. Проверить наличие фигуры в списке");
            System.out.println("4. Выход");

            count = Integer.parseInt(mtt.bf.readLine());

            if (count == 1) {
                System.out.println("введите цвет (белый, синий, красный, зеленый)");
                String color = mtt.bf.readLine();
                System.out.println("введите сторону");
                int a = Integer.parseInt(mtt.bf.readLine());
                System.out.println("введите сторону");
                int b = Integer.parseInt(mtt.bf.readLine());

                mtt.rectangles.add(mtt.createFigure(color, a, b));

            }

            if (count == 2) {
                System.out.println("введите цвет (белый, синий, красный, зеленый)");
                String color = mtt.bf.readLine();

                System.out.println(mtt.findColor(color));
            }

            if (count == 3) {
                System.out.println("введите цвет (белый, синий, красный, зеленый)");
                String color = mtt.bf.readLine();
                System.out.println("введите сторону");
                int a = Integer.parseInt(mtt.bf.readLine());
                System.out.println("введите сторону");
                int b = Integer.parseInt(mtt.bf.readLine());

                mtt.yesOrNoFigure(color, a, b);
            }

            if (count == 4) {
                break;
            }

        }
     }

     public Rectangle createFigure(String color, int a, int b) throws NoColorException {
         Optional<Color> first = Arrays
                 .stream(Color.values())
                 .filter(v -> v.getColor().equals(color))
                 .findFirst();

         if (first.isPresent()) {
             return new Rectangle(first.get(), a, b);
         }

         throw new NoColorException(String.format("такой цвет не найден %s", color));
     }

     public List<Rectangle> findColor(String color) {

         List<Rectangle> rectangle = rectangles
                 .stream()
                 .filter(v -> v.getColor().equals(color))
                 .collect(Collectors.toList());

         if (rectangle.isEmpty()) {
             System.out.println("фигур такого цвета не найдено");
             return rectangle;
         }
         System.out.println();
         return rectangle;
     }

     public void yesOrNoFigure(String color, int a, int b) throws NoColorException {
         Rectangle figure = createFigure(color, a, b);
         if (rectangles.contains(figure)) {
             System.out.println("фигура содержится в списке");
             return;
         }
         System.out.println("фигура не содержится в списке");
     }
}