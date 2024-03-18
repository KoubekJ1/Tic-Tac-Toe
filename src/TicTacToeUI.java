package src;

import javax.swing.*;
import java.awt.*;

public class TicTacToeUI extends JFrame {
    private JButton placeButton;
    private JButton xButton;
    private JButton oButton;
    private JButton exitButton;
    private JButton[][] grid;

    public TicTacToeUI() throws HeadlessException {
        this.placeButton = new JButton("Place");
        this.exitButton = new JButton("Exit");
        this.xButton = new JButton("Place X");
        this.oButton = new JButton("Place O");
        this.grid = new JButton[3][3];
        setTitle("TicTacToe");
        setSize(500, 500);
        add(placeButton, BorderLayout.SOUTH);
        add(exitButton, BorderLayout.NORTH);
        add(xButton,BorderLayout.SOUTH);
        add(oButton, BorderLayout.EAST);
        setVisible(true);
    }
}
