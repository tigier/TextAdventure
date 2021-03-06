package View.View1;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

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
        this.setSize(1000,600);
        //this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        setConsole();

        //Buttons
        NButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fight == false) {
                    control.movePlayer("North");
                    setConsole();
                    if (control.map.getTile().getWeapon() == (null) && control.map.getTile().getMonster() == (null)) {
                        control.map.getTile().clear();
                    }
                } else if (fight == true){
                    if (fH.fight() == true){
                        textArea.setText(textArea.getText()+" You got 'em! Keep going.");
                        fight = false;
                        setButtons(false);
                    } else if (fH.fight() == false){
                        textArea.setText(textArea.getText()+" Wow you got R3KT. Learn to play, noob.");
                        NButton.setText("Beaten by a code..");
                        SButton.setText("Noob");
                        EButton.setText("L2P");
                        WButton.setText("Loser");
                        NButton.setEnabled(false);
                        SButton.setEnabled(false);
                        EButton.setEnabled(false);
                        WButton.setEnabled(false);
                    }
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
                    textArea.setText(textArea.getText()+" You moved backwards to the Tile which you just left. Pussy.");
                    fight = false;
                    setButtons(false);
                    setConsole();
                }
            }
        });
        WButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fight == false) {
                    if (control.getPlayer().getXPos() != 0) {
                        control.movePlayer("West");
                        setConsole();
                        if (control.map.getTile().getWeapon() == (null) && control.map.getTile().getMonster() == (null)) {
                            control.map.getTile().clear();
                        }
                    } else {
                        textArea.setText("Current tile: [" + control.map.getPlayer().getYPos() + "/" + control.map.getPlayer().getXPos() + "]" + "\n" + "\n" + "I won't go into that tall grass!" + "\n" + "Wild Pokemon could attack me!");
                    }
                }
            }
        });
        EButton.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e){
                if (fight == false) {
                    control.movePlayer("East");
                    setConsole();
                    if (control.map.getTile().getWeapon() == (null) && control.map.getTile().getMonster() == (null)) {
                        control.map.getTile().clear();
                    }
                }
            }

        });
    }

    // Ausgabe
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
            setButtons(true);
            fH = control.createFh();
        }
        else if(control.map.getTile().getWeapon() != null){
            textArea.setText(textArea.getText()+actionMessageW());
            control.getPlayer().setWeaponEquipped(control.map.getTile().getWeapon().getType());

        }
        else{
            textArea.setText(textArea.getText()+actionMessage());
        }
    }

    // Ausgabetext, am Anfang
    public String StartMessage(){
        return "Hello Player,"+"\n"+"This is our Textadventure."+"\n"+"To play the game simply move around the tile-based world,"+"\n"+"find weapons and battle monsters."+"\n"+"\n"+"Have fun!";
    }

    // Ausgabetext, wenn man auf ein leeres Feld geht.
    public String actionMessage(){
        if (control.map.getTile().getCleared() == false){
            return "Keep going!"+"\n"+"Here is nothing to see.";
        }
        else{
            return "This place seems familiar."+"\n"+"Nothing here tho.";
        }
    }

    // Ausgabetext, wenn man auf ein Monster stößt
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

    // Ausgabetext, wenn man auf eine Waffe stößt
    public String actionMessageW(){
        return "yay...a new weapon: "+control.getPlayer().getWeaponEquipped().getName()+"\n"+" New strength:"+(control.getPlayer().getStrength()+control.getPlayer().getWeaponEquipped().getStrength());
    }

    // set-Methode
    public void fight(){
        fight = true;
    }

    // Änderung der Inhalte der Buttons, wenn man sich im Kampf befindet.
    public void setButtons(boolean fight){
        if (fight) {
            NButton.setText("Fight like a man!");
            SButton.setText("Ahhh, Run away!");
            WButton.setText(null);
            EButton.setText(null);
        } else{
            NButton.setText("North");
            SButton.setText("South");
            WButton.setText("West");
            EButton.setText("East");
        }
    }
}
