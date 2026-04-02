package wumpusworld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class wumpusframe extends JFrame implements KeyListener, MouseListener {
    public static final int PLAYING = 0;
    public static final int DEAD = 1;
    public static final int WON = 2;

    private int status;
    private WumpusPlayer player;
    private WumpusMap map;
    public wumpusframe(){
        setLayout(null);
        setSize(500,500);
        addMouseListener(this);



        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("key pressed down!");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mouse pressed!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public void reset(){

    }

    public void paint(Graphics g){

    }

    public void addNotify(){

    }
}
