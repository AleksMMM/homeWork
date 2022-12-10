package homeworks.homeworkSeven.tictactoe;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class ComputerKiller extends Player {


    public ComputerKiller(Symbol[][] gameField, Symbol symbol) {
        super(gameField, symbol);
    }

    @Override
    public void makeStep() throws IOException {
        Random random = new Random();
        int rand = random.nextInt(2);

        if (rand == 0) {
            Arrays.stream(gameField)
                    .flatMap(v -> Arrays.stream(v).filter(p -> p.equals(Symbol.EMPTY))
                            .map(sym -> sym = symbol)).findFirst();
        }
        if (rand == 1) {
            Arrays.stream(gameField)
                    .flatMap(v -> Arrays.stream(v).filter(p -> p.equals(Symbol.EMPTY))
                            .filter(s -> !s.equals(symbol))
                            .map(sym -> sym = symbol)).findFirst();
        }

    }
}