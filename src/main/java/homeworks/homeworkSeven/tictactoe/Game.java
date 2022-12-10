package homeworks.homeworkSeven.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Game {

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    //|_||_||_|
    //|_||_||_|
    //|_||_||_|

    private Symbol[][] gameField = new Symbol[3][3];

    {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                gameField[i][j] = Symbol.EMPTY;
            }
        }
    }

    public void startGame() throws IOException {
        Player playerOne = null;
        Player playerTwo = null;

        System.out.println("1. Человек vs Человек\n" +
                "2. Человек vs Компьютер\n" +
                "3. Компьютер vs Компьютер\n" +
                "4. Компьютер vs КомпьютерКиллер"
        );

        int type = Integer.parseInt(bf.readLine());

        if (type == 1) {
            playerOne = new HumanPlayer(gameField, Symbol.O);
            playerTwo = new HumanPlayer(gameField, Symbol.X);
        }
        if (type == 2) {
            playerOne = new HumanPlayer(gameField, Symbol.O);
            playerTwo = new ComputerPlayer(gameField, Symbol.X);
        }
        if (type == 3) {
            playerOne = new ComputerPlayer(gameField, Symbol.O);
            playerTwo = new ComputerPlayer(gameField, Symbol.X);
        }
        if (type == 4) {
            playerOne = new ComputerPlayer(gameField, Symbol.O);
            playerTwo = new ComputerKiller(gameField, Symbol.X);
        }

        int turn = 0;
        Symbol winner = null;
        while (winner == null) {
            gameFieldPrint();
        if (turn % 2 == 0) {
            playerOne.makeStep();
            winner = finish(playerOne.symbol);
        } else {
            playerTwo.makeStep();
            winner = finish(playerTwo.symbol);
        }
        turn++;
        }
        System.out.println("Результат игры: " + winner);
    }

    private Symbol finish(Symbol symbol) {
        //TODO: вызываем все методы проверки
        if (checkVerticalWinner(symbol) != null) {
            return symbol;
        } else if (checkHorizontalWinner(symbol) != null) {
            return symbol;
        } else if (checkDiagonalWinner(symbol) != null) {
            return symbol;
        } else if (checkDraw(symbol) != null) {
            return Symbol.DRAW;
        }

        return null; //возвращает победителя или ничью после всех проверок, либо null
    }

    private Symbol checkHorizontalWinner(Symbol symbol) {
        //TODO: проверка на победителя по горизонтали
        int row = 0;
        while (row < gameField.length) {
            List<Symbol> collect = Arrays.stream(gameField[row]).filter(sym -> sym.equals(symbol))
                    .collect(Collectors.toList());
            if (collect.size() == gameField.length) {
                return symbol;
            }
            row++;
        }
        return null; //возвращаем победителя, если есть, иначе null
    }

    private Symbol checkVerticalWinner(Symbol symbol){
        //TODO: проверка на победителя по вертикали

        List<Symbol> collectVertical = Arrays.stream(gameField)
                .flatMap(cell -> Arrays.stream(cell)
                        .filter(value -> value.equals(symbol)))
                        .collect(Collectors.toList());

        if (collectVertical.size() == gameField[0].length) {
            return symbol;
        }
        return null; //возвращаем победителя, если есть, иначе null
    }

    private Symbol checkDiagonalWinner(Symbol symbol){
        //TODO: проверка на победителя по диагонали
        int count = 0;
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (i == j && gameField[i][j].equals(symbol)) {
                    count++;
                }
            }
        }

        if (count == gameField.length) {
            return symbol;
        } else {

            count  = 0;
            for (int i = gameField.length - 1; i <= 0; i--) {
                for (int j = gameField[i].length - 1; j <= 0; j--) {
                    if (i == j && gameField[i][j].equals(symbol)) {
                        count++;
                    }
                }
            }
            return count == gameField.length ? symbol : null;
        }
    }

    private Symbol checkDraw(Symbol symbol) {
        if (checkDiagonalWinner(symbol) == null && checkDiagonalWinner(symbol) == null
                && checkVerticalWinner(symbol) == null) {
            Optional<Symbol> first = Arrays.stream(gameField)
                    .flatMap(sym -> Arrays.stream(sym).filter(v -> v.equals(Symbol.EMPTY)))
                    .findFirst();

            if (first.isPresent()) {
                return null;
            }
        }
        //TODO: проверка на ничью
        return Symbol.DRAW; //возвращаем Symbol.DRAW, если есть, иначе null
    }

    public void gameFieldPrint() {
        for (int i = 0; i < gameField.length; i++) {
            System.out.println();
            for (int j = 0; j < gameField[i].length; j++) {
                System.out.print(gameField[i][i]);
            }
        }
        System.out.println();
    }
}