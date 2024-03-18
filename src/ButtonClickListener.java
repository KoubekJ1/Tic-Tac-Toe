package src;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonClickListener implements ActionListener {
    private int row;
    private int col;
    private char current;
    public ButtonClickListener(int row, int col, char current){
        this.row = row;
        this.col = col;
        this.current = current;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        if (buttonClicked.getText().isEmpty()){
            buttonClicked.setText(Character.toString(current));
        }
    }
}
