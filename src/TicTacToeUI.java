package src;

import javax.swing.*;
import java.awt.*;

public class TicTacToeUI extends JFrame {
    private JButton placeButton;
    private JButton xButton;
    private JButton oButton;
    private JButton exitButton;
    private JButton[][] grid;
    private char currentPlayer;

    public TicTacToeUI() throws HeadlessException {
        this.placeButton = new JButton("Place");
        this.exitButton = new JButton("Exit");
        this.xButton = new JButton("Place X");
        this.oButton = new JButton("Place O");
        this.grid = new JButton[3][3];
        currentPlayer = 'X';
        setTitle("TicTacToe");
        setSize(500, 500);
        add(placeButton, BorderLayout.SOUTH);
        add(exitButton, BorderLayout.NORTH);
        add(xButton,BorderLayout.SOUTH);
        add(oButton, BorderLayout.EAST);


        for (int row =0; row<3;row++){
            for (int col = 0; col<3;col++){
                JButton button = new JButton();
                button.setFont(new Font("Arial",Font.BOLD,40));
                button.addActionListener(new ButtonClickListener(row, col));
                add(button);
                grid[row][col] = button;
            }
        }
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }
}
