package View.View1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Control.Control;

public class MainView1 extends JFrame{

    private JPanel actionPanel;
    private JButton SButton;
    private JButton NButton;
    private JButton WButton;
    private JButton EButton;
    public JTextArea textArea;
    Control control = new Control();
    boolean fight = false;

    public MainView1() {
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

    public void setConsole() {
        textArea.setText("Current tile: [" + control.map.getPlayer().getYPos() + "/" + control.map.getPlayer().getXPos() + "]" + "\n" + "\n");
        if (control.getPlayer().getTilesCleared() == 0) {
            textArea.setText(textArea.getText() + StartMessage());
            control.getPlayer().clearTile();
        } else if (control.map.getTile().getMonster() != null) {
            textArea.setText(textArea.getText() + actionMessageM());
        }
        else if(control.map.getTile().getWeapon() != null){
            textArea.setText(textArea.getText()+actionMessageW());
        }
        else{
            textArea.setText(textArea.getText()+actionMessage());
        }
    }

    public String StartMessage(){
        return "Hello Player,"+"\n"+"This is our Textadventure."+"\n"+"To play the game simply move around the tile-based world,"+"\n"+"find weapons and battle monsters."+"\n"+"\n"+"Have fun!";
    }

    public String actionMessage(){
        if (control.map.getTile().getCleared() == false){
            return "Keep going!"+"\n"+"Here is nothing to see.";
        }
        else{
            return "This place seems familiar."+"\n"+"Nothing here tho.";
        }
    }
    public String actionMessageM(){
        if (control.map.getTile().getMonster().getName() == "Slime"){
            return "You have encountered:"+"\n"+"A smelling pile of goo!";
        }
        else if (control.map.getTile().getMonster().getName() == "Goblin"){
            return "You have encountered:"+"\n"+"An ugly lilliputian!";
        }
        else if (control.map.getTile().getMonster().getName() == "SlimeKing"){
            return "You have encountered:"+"\n"+"A royal pile of goo!";
        }
        else if (control.map.getTile().getMonster().getName() == "Ogre"){
            return "You have encountered:"+"\n"+"A green swamp guy!";
        }
        else if (control.map.getTile().getMonster().getName() == "Orc"){
            return "You have encountered:"+"\n"+"An ugly face ,who really needs an orthodontist!";
        }
        else if (control.map.getTile().getMonster().getName() == "Golem"){
            return "You have encountered:"+"\n"+"A living mountain!!!";
        }
        else if (control.map.getTile().getMonster().getName() == "Demon"){
            return "You have encountered:"+"\n"+"A GODDAMN SERVANT OF HELL!!!!!!!!!!!!!!.....REALLY ANTHONY!?!?!?!"+"\n"+"YOU THOUGHT THAT WAS A GOOD IDEA?";
        }
        else if (control.map.getTile().getMonster().getName() == "Dragon"){
            return "You have encountered:"+"\n"+"A GODDAMN DRAGON!!!!!...You programmers are Crazy!!!";
        }
        else{
            return null;
        }
    }

    public String actionMessageW(){
        return null;
    }

    public void fight(){
        fight = true;
    }
}