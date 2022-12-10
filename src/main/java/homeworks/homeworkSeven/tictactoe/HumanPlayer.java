package homeworks.homeworkSeven.tictactoe;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class HumanPlayer extends Player {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public HumanPlayer(Symbol[][] gameField, Symbol symbol) {
        super(gameField, symbol);
    }

    @Override
    public void makeStep() throws IOException {
        boolean correct = false;
        while (!correct) {
            System.out.println("Enter row: ");
            row = Integer.parseInt(bf.readLine());
            System.out.println("Enter col: ");
            col = Integer.parseInt(bf.readLine());

            if ((row >= 0 && row < gameField.length && col >= 0 && col < gameField.length) && notBussy()) {
                correct = true;
            } else {
                System.out.println("Координаты не корректные. Повторите ввод");
            }
        }
        gameField[row][col] = symbol;
    }
}