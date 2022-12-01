package homeworks.hm7_recursion.saper;

public class GamesMine {

    //Сапер:
    //|_||_||+||_||_|
    //|*||*||_||*||*|
    //|_||*||_||*||_|
    //|_||_||*||_||_|
    //|_||_||_||_||_|

    String EMPTY = "|_|";
    String VISIT = "|+|";
    String MINE = "|*|";

    String[][] arr = new String[5][5];


    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = EMPTY;
            }
        }

        arr[1][0] = MINE;
        arr[1][1] = MINE;
        arr[1][3] = MINE;
        arr[1][4] = MINE;
        arr[2][1] = MINE;
        arr[2][3] = MINE;
        arr[3][2] = MINE;

    }

    public void allVisit(int row, int col) {

        int r = row;
        int c = col;

        if (isExist(r, c)) {

            if (isEmpty(r, c) & !isMine(r, c)) {
                arr[row][col] = VISIT;
            }
            // проверяю слева
            allVisit(r, c -1);
            //проверяю вверх
            allVisit(r - 1, c);
            //проверяю справа
            allVisit(r, c + 1);
            //проверяю вниз
            allVisit(r + 1, c);

        }

    }

    // проверить что ячейка существует
    private boolean isExist(int row, int col) {
        return row >= 0 && row < arr.length && col >= 0 && col < arr[row].length;
    }

    // проверить что ячейка пустая
    private boolean isEmpty(int row, int col) {
        return arr[row][col].equals(EMPTY);
    }

    // проверить что ячейка не посещена
    private boolean isNotVisit(int row, int col) {
        return arr[row][col].equals(VISIT);
    }

    private boolean isMine(int row, int col) {
        return arr[row][col].equals(MINE);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sb.append(arr[i][j]); //складываем кубики всей строки
            }
            sb.append("\n"); //делаем переход на новую строчку
        }
        return sb.toString();
    }
}
