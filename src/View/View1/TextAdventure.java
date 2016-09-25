package View.View1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Control.FightHandler;
import Control.Control;

public class TextAdventure extends JFrame{

    private JPanel actionPanel;
    private JButton SButton;
    private JButton NButton;
    private JButton WButton;
    private JButton EButton;
    public JTextArea textArea;
    Control control = new Control();




    public TextAdventure() {
        super("Text Adventure");
        this.setContentPane(actionPanel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        setConsole();

        NButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                control.movePlayer("North");
                setConsole();
            }
        });
        SButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                control.movePlayer("South");
                setConsole();
            }
        });
        WButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                control.movePlayer("West");
                setConsole();
            }
        });
        EButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                control.movePlayer("East");
                setConsole();
            }
        });
    }


    public void setConsole(){
        textArea.setText("Current tile: [" + control.map.getPlayer().getYPos() + "/" + control.map.getPlayer().getXPos() + "]" + "\n"+"\n");
        if(control.getPlayer().getTilesCleared() == 0) {
            textArea.setText(textArea.getText() + StartMessage());
            control.getPlayer().clearTile();
        }
        else{
            textArea.setText(textArea.getText()+actionMessage());
        }
    }

    public String StartMessage(){
        return "Hello Player,"+"\n"+"This is our Textadventure."+"\n"+"To play the game simply move around the tile-based world,"+"\n"+"find weapons and battle monsters."+"\n"+"\n"+"Have fun!";
    }

    public String actionMessage(){
        if (control.map.getPosition().getMonster() == null && control.map.getPosition().getWeapon() == null && control.map.getPosition().getCleared() == false){
            return "Keep going!"+"\n"+"Here is nothing to see.";
        }
        else if (control.map.getPosition().getMonster() == null && control.map.getPosition().getWeapon() == null && control.map.getPosition().getCleared() == true){
            return "This place seems familiar."+"\n"+"Nothing here tho.";
        }
        else if (control.map.getPosition().getMonster() ==){

        }
    }
}
