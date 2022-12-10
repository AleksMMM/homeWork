package homeworks.homeworkSeven.tictactoe;

public enum Symbol {

    X("|X|"),O("|O|"),EMPTY("|_|"), DRAW("Ничья");
    private String psevdo;

    Symbol(String psevdo) {
        this.psevdo = psevdo;
    }

    @Override
    public String toString() {
        return psevdo;
    }
}
