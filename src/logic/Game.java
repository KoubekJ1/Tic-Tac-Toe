package src.logic;

import javax.swing.*;

public class Game {

    public char switchPlayer(char player) {
        if (player == 'X') {
            return 'O';
        } else {
            return 'X';
        }
    }

    public boolean checkWin() {
        return false;
    }

    private boolean checkDraw() {
        return false;
    }

    private void resetGame() {

    }

}
