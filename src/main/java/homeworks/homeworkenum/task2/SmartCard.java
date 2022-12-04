package homeworks.homeworkenum.task2;

public class SmartCard extends Card {

    public SmartCard(int value, String mast) {
        super(value, mast);
    }

    @Override
    public int generateValue(int multiplayer) {
        if (multiplayer == 1) {
            return value;
        } else if (multiplayer == 2) {
            return value * 2;
        } else if (multiplayer == 3) {
            return value * 3;
        } else if (multiplayer == 4 && !mast.equals("пики") && !mast.equals("крести")) {
            return value * 2;
        }

        return 0;
    }
}