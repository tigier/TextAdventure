package View.View2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Control.Control;

public class MainView2 extends JFrame{
    private JPanel actionPanel;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JButton southButton;
    private JButton eastButton;
    private JButton northButton;
    private JButton westButton;
    private JButton fightButton;
    private JButton escapeButton;
    private JButton dodgeButton;
    Control control = new Control();

    public MainView2() {
        super("Text Adventure");
        this.setContentPane(actionPanel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        setConsole();

        northButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                control.movePlayer("North");
                setConsole();
            }
        });
        southButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                control.movePlayer("South");
                setConsole();
            }
        });
        westButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                control.movePlayer("West");
                setConsole();
            }
        });
        eastButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                control.movePlayer("East");
                setConsole();
            }
        });
    }


    public void setConsole(){
        textArea1.setText("Current tile: [" + control.map.getPlayer().getYPos() + "/" + control.map.getPlayer().getXPos() + "]" + "\n" + "\n");
        if (control.getPlayer().getTilesCleared() == 0) {
            textArea3.setText(textArea3.getText() + StartMessage());
            control.getPlayer().clearTile();
        } else if (control.map.getTile().getMonster() != null) {
            textArea2.setText(textArea2.getText() + actionMessageM());
        }
        else if(control.map.getTile().getWeapon() != null){
            textArea2.setText(textArea2.getText()+actionMessageW());
        }
        else{
            textArea2.setText(textArea2.getText()+actionMessage());
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
}
