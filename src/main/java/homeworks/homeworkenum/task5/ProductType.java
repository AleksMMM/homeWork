package homeworks.homeworkenum.task5;

public enum ProductType {

    INTERNET("интернет"), PHONE("телефония"), TV("телевидение");

    private String type;

    ProductType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
