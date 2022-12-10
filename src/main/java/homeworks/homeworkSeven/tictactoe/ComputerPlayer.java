package homeworks.homeworkSeven.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.Random;

public class ComputerPlayer extends Player {

    private Random rnd = new Random();

    public ComputerPlayer(Symbol[][] gameField, Symbol symbol) {
        super(gameField, symbol);
    }

    @Override
    public void makeStep() throws IOException {
        int row = rnd.nextInt(gameField.length);
        int col = rnd.nextInt(gameField.length);
        gameField[row][col] = symbol;
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
    }
}