package homeworks.homeworkenum.task2;

public class SillyCard extends Card {

    public SillyCard(int value, String mast) {
        super(value, mast);
    }

    @Override
    public int generateValue(int multiplayer) {
        if (multiplayer == 1) {
            return value * 4;
        } else if (multiplayer == 2) {
            return value - 1;
        } else if (multiplayer == 3 && mast.equals("пики")) {
            return value - 2;
        } else if (multiplayer == 4 && !mast.equals("пики") && !mast.equals("крести")) {
            return value * 4;
        }

        return 0;
    }
}
