package View.View1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Control.God;

public class TextAdventure extends JFrame{

    private JPanel actionPanel;
    private JButton SButton;
    private JButton NButton;
    private JButton WButton;
    private JButton EButton;
    public JTextArea textArea;
    private boolean newGame = true;
    God thor = new God();



    public TextAdventure() {
        super("Text Adventure");
        this.setContentPane(actionPanel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        setConsole();

        NButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                thor.movePlayer("North");
                setConsole();
            }
        });
        SButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                thor.movePlayer("South");
                setConsole();
            }
        });
        WButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                thor.movePlayer("West");
                setConsole();
            }
        });
        EButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                thor.movePlayer("East");
                setConsole();
            }
        });
    }

    public void setConsole(){
        textArea.setText("Current tile: [" + thor.player.getYPos() + "/" + thor.player.getXPos() + "]" + "\n");
        if(newGame == true) {
            textArea.setText(textArea.getText() + StartMessage());
            newGame=false;
        }
    }

    public String StartMessage(){
        return "Hello Player,"+"\n"+"This is our Textadventure."+"\n"+"To play the game simply move around the tile-based world,"+"\n"+"find weapons and battle monsters."+"\n"+"\n"+"Have fun!";
    }

}
