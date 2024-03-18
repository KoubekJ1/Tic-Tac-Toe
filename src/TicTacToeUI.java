package src;

import javax.swing.*;
import java.awt.*;

public class TicTacToeUI extends JFrame {
    private JButton exitButton;
    private JButton[][] grid;
    private char currentPlayer;

    public TicTacToeUI() throws HeadlessException {
        this.exitButton = new JButton("Exit");
        setLayout(new GridLayout(3,3));
        grid = new JButton[3][3];
        currentPlayer = 'X';
        setTitle("TicTacToe");
        setDefaultCloseOperation(EXIT_ON_CLOSE);



        for (int row =0; row<3;row++){
            for (int col = 0; col<3;col++){
                JButton button = new JButton();
                button.setPreferredSize(new Dimension(150,150));
                button.setFont(new Font("Arial",Font.BOLD,40));
                button.addActionListener(new ButtonClickListener(row, col, currentPlayer));
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

    public JButton[][] getGrid() {
        return grid;
    }
}
