package homeworks.homeworkSeven.tictactoe;

import java.io.IOException;

public class Player {

    Symbol[][] gameField;
    Symbol symbol;
    int row;
    int col;

    public Player(Symbol[][] gameField, Symbol symbol) {
        this.gameField = gameField;
        this.symbol = symbol;
    }

    public void makeStep() throws IOException {

    }

    public boolean notBussy() {
        Symbol sym = gameField[row][col];
        if (sym.equals(Symbol.EMPTY)) {
            return true;
        }
        return false;
    }
}