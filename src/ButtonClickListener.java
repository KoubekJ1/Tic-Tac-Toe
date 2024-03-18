package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    TicTacToeUI ticTacToeUI = new TicTacToeUI();
    private int row;
    private int col;
    public ButtonClickListener(int row, int col){
        this.row = row;
        this.col = col;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        if (buttonClicked.getText().isEmpty()){
            buttonClicked.setText(Character.toString(ticTacToeUI.getCurrentPlayer()));
        }
    }
}
