package homeworks.homeworkenum.task3;

public enum Color {

    WHITE("белый"), BLUE("синий"), RED("красный"), GREEN("зеленый");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
