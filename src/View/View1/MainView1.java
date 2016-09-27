package View.View1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Control.Control;
import Control.FightHandler;

public class MainView1 extends JFrame{

    private JPanel actionPanel;
    private JButton SButton;
    private JButton NButton;
    private JButton WButton;
    private JButton EButton;
    public JTextArea textArea;
    Control control = new Control();
    FightHandler fH;
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
                if (fight == false) {
                    control.movePlayer("North");
                    setConsole();
                    if (control.map.getTile().getWeapon() == (null) && control.map.getTile().getMonster() == (null)) {
                        control.map.getTile().clear();
                    }
                } else if (fight == true){
                    fH.fight();
                }
            }
        });
        SButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fight == false){
                    if (control.getPlayer().getYPos() != 0){
                        control.movePlayer("South");
                        setConsole();
                        if (control.map.getTile().getWeapon() == (null) && control.map.getTile().getMonster() == (null)) {
                            control.map.getTile().clear();
                        }
                    }
                    else{
                        textArea.setText("Current tile: [" + control.map.getPlayer().getYPos() + "/" + control.map.getPlayer().getXPos() + "]" + "\n" + "\n"+"You are amazed by the glimmering water blocking your way."+ "\n"+"But you are afraid of water!");
                    }
                } else if (fight == true){
                    fH.escape();
                }

            }
        });
        WButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (control.getPlayer().getXPos() != 0) {
                    control.movePlayer("West");
                    setConsole();
                    if (control.map.getTile().getWeapon() == (null) && control.map.getTile().getMonster() == (null)) {
                        control.map.getTile().clear();
                    }
                }
                else{
                    textArea.setText("Current tile: [" + control.map.getPlayer().getYPos() + "/" + control.map.getPlayer().getXPos() + "]" + "\n" + "\n"+"I won't go into that tall grass!"+ "\n"+"Wild Pokemon could attack me!");
                }
            }
        });
        EButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                control.movePlayer("East");
                setConsole();
                if (control.map.getTile().getWeapon() ==(null) && control.map.getTile().getMonster() == (null)){
                    control.map.getTile().clear();
                }
            }
        });
    }

    public void setConsole() {
        textArea.setText("Current tile: [" + control.map.getPlayer().getYPos() + "/" + control.map.getPlayer().getXPos() + "]" + "\n" + "\n");
        if (control.getPlayer().getTilesCleared() == 0) {
            textArea.setText(textArea.getText() + StartMessage());
            control.getPlayer().clearTile();
        }
        else if (control.map.getTile().getX()== 0 && control.map.getTile().getY() == 0){
            textArea.setText(textArea.getText() + "Nothing here!" + "\n" + "Just a big sign saying spawn.");
        }
        else if (control.map.getTile().getMonster() != null) {
            textArea.setText(textArea.getText() + actionMessageM());
            fight();
            fH = control.createFh();
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
        if (control.map.getTile().getMonster().getName().equals("Slime")){
            return "You have encountered:"+"\n"+"A smelling pile of goo!";
        }
        else if (control.map.getTile().getMonster().getName().equals("Goblin")){
            return "You have encountered:"+"\n"+"An ugly lilliputian!";
        }
        else if (control.map.getTile().getMonster().getName().equals("SlimeKing")){
            return "You have encountered:"+"\n"+"A royal pile of goo!";
        }
        else if (control.map.getTile().getMonster().getName().equals("Ogre")){
            return "You have encountered:"+"\n"+"A green swamp guy!";
        }
        else if (control.map.getTile().getMonster().getName().equals("Orc")){
            return "You have encountered:"+"\n"+"An ugly face ,who really needs an orthodontist!";
        }
        else if (control.map.getTile().getMonster().getName().equals("Golem")){
            return "You have encountered:"+"\n"+"A living mountain!!!";
        }
        else if (control.map.getTile().getMonster().getName().equals("Demon")){
            return "You have encountered:"+"\n"+"A GODDAMN SERVANT OF HELL!!!!!!!!!!!!!!.....REALLY ANTHONY!?!?!?!"+"\n"+"YOU THOUGHT THAT WAS A GOOD IDEA?";
        }
        else if (control.map.getTile().getMonster().getName().equals("Dragon")){
            return "You have encountered:"+"\n"+"A GODDAMN DRAGON!!!!!...You programmers are Crazy!!!";
        }
        else{
            return null;
        }
    }

    public String actionMessageW(){
        return "yay.....a new weapon!";
    }

    public void fight(){
        fight = true;
    }

    public void setButtons(){
        NButton.setText("Fight like a man!");
        SButton.setText("Ahhh, Run away!");
        WButton.setText(null);
        EButton.setText(null);
    }
}
