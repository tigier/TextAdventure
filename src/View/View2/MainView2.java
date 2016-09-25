package View.View2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Control.FightHandler;
import Control.Control;
import Model.Monster.*;

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

    public TextAdventure() {
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
        textArea1.setText("Current tile: [" + control.map.getPlayer().getYPos() + "/" + control.map.getPlayer().getXPos() + "]" + "\n"+"\n");
        if(control.getPlayer().getTilesCleared() == 0) {
            textArea1.setText(textArea1.getText() + StartMessage());
            control.getPlayer().clearTile();
        }
        else{
            textArea3.setText(textArea3.getText()+actionMessage());
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
        else if (control.map.getPosition().getMonster() == Slime){
            return "You have encountered:"+"\n"+"A smelling pile of goo!";
        }
        else if (control.map.getPosition().getMonster() == Goblin){
            return "You have encountered:"+"\n"+"An ugly lilliputian!";
        }
        else if (control.map.getPosition().getMonster() == SlimeKing){
            return "You have encountered:"+"\n"+"A royal pile of goo!";
        }
        else if (control.map.getPosition().getMonster() == Ogre){
            return "You have encountered:"+"\n"+"A green swamp guy!";
        }
        else if (control.map.getPosition().getMonster() == Orc){
            return "You have encountered:"+"\n"+"An ugly face ,who really needs an orthodontist!";
        }
        else if (control.map.getPosition().getMonster() == Golem){
            return "You have encountered:"+"\n"+"A motherfucking mountain!!!";
        }
        else if (control.map.getPosition().getMonster() == Demon){
            return "You have encountered:"+"\n"+"A GODDAMN SERVANT OF HELL!!!!!!!!!!!!!!.....REALLY ANTHONY!?!?!?!"+"\n"+"YOU THOUGHT THAT WAS A GOOD IDEA?";
        }
        else if (control.map.getPosition().getMonster() == Dragon){
            return "You have encountered:"+"\n"+"A GODDAMN DRAGON!!!!!...You programmers are Crazy!!!";
        }

    }
}
