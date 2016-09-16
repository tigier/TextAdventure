package View1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Control.Movement;
/**
 * Created by Anthony on 12.09.2016.
 */
public class TextAdventure extends JFrame{
    private JPanel actionPanel;
    private JButton SButton;
    private JButton NButton;
    private JButton WButton;
    private JButton EButton;
    private JTextArea textArea1;
    Movement move = new Movement();


    public TextAdventure() {

        super("Text Adventure");
        this.setContentPane(actionPanel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        NButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                move.movePlayer("North");
            }
        });
        SButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                move.movePlayer("South");
            }
        });
        WButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                move.movePlayer("West");
            }
        });
        EButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                move.movePlayer("East");
            }
        });
    }

}
