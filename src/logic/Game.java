package src.logic;

public class Game {

    public static char switchPlayer(char player) {
        if (player == 'X') {
            return 'O';
        } else {
            return 'X';
        }
    }

}
