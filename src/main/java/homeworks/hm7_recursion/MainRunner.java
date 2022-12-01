package homeworks.hm7_recursion;

public class MainRunner {

    public static void main(String[] args) {

        //|P||_||_||_||_|
        //|_||_||_||_||_|
        //|*||_||*||_||_|
        //|_||*||_||_||*|
        //|_||_||E||_||_|

        Games games = new Games();
        games.findExit(0, 0);
        System.out.println(games);
    }
}
