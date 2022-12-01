package homeworks.hm7_recursion;

public class Games {

    //|P||_||_||_||_|
    //|_||_||_||_||_|
    //|*||_||*||_||_|
    //|_||*||_||_||*|
    //|_||_||E||_||_|

    String[][] arr = new String[5][5];

    final String EMPTY = "|_|";
    final String PLAYER = "|P|";
    final String WALL = "|*|";
    private String EXIT = "|E|";
    private String VISITED = "|&|";

    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = EMPTY;
            }
        }

        // заполняю игрока и выход из стены
        arr[0][0] = PLAYER;

        // заполяю стены
        arr[2][2] = WALL;
        arr[2][0] = WALL;
        arr[3][1] = WALL;
        arr[3][4] = WALL;
        arr[4][2] = EXIT;
    }

    // координаты клетки где находимся
    public void findExit(int row, int col) {
        int r;
        int c;

        // начинаю смотреть влево
        r = row;
        c = col - 1;
        if (isExist(r, c)) {
            if (isExit(r, c)) {
                System.out.println("выход найден");
                return;
            }
            if (isEmpty(r, c)) {
                findExit(r, c);
            }
        }

        // смотрю вверх
        r = row - 1;
        c = col;
        if (isExist(r, c)) {
            if (isExit(r, c)) {
                System.out.println("выход найден");
                return;
            }

            if (isEmpty(r, c)) {
                arr[row][col] = VISITED;
                findExit(r, c);
            }
        }

        // смотрю вправо
        r = row;
        c = col + 1;
        if (isExist(r, c)) {
            if (isExit(r, c)) {
                System.out.println("выход найден");
                return;
            }

            if (isEmpty(r, c)) {
                arr[r][c] = VISITED;
                findExit(r, c);
            }
        }

        // смотрю вниз
        r = row + 1;
        c = col;
        if (isExist(r, c)) {
            if (isExit(r, c)) {
                System.out.println("выход найден");
                return;
            }

            if (isEmpty(r, c)) {
                arr[row][col] = VISITED;
                findExit(r, c);
            }
        }
        return;
    }

    // если выход найден то true;
    private boolean isExit(int row, int col) {
        if (arr[row][col].equals(EXIT)) {
            return true;
        }
        return false;
    }

    // проверка если клетка существует
    private boolean isExist(int row, int col) {
        return row >= 0 && row < arr.length && col >= 0 && col < arr[row].length;
    }

    // проверка если клетка пустая
    private boolean isEmpty(int row, int col) {
        return arr[row][col].equals(EMPTY);
    }

    // проверка что клетка не посещена
    private boolean isVisited(int row, int col) {
        return arr[row][col].equals(VISITED);
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