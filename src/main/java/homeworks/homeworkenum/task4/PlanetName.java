package homeworks.homeworkenum.task4;

public enum  PlanetName {

    MERCURY("Mercury"), VENUS("Venus"), EARTH("Earth"), MARS("Mars"), JUPITER("Jupiter"), SATURN("Saturn"),
    URANUS("Uranus"), NEPTUNE("Neptune");

    private String name;

    PlanetName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
