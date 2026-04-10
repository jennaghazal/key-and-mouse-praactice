package wumpusworld;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class testinnnnggg extends JFrame implements KeyListener, MouseListener {

    public testinnnnggg(){
        super("ah lelele ah lela");

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,700);

        addMouseListener(this);
        addKeyListener(this);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyChar() == '*'){
            System.out.println("cheat mode enabled");
        } else if (e.getKeyCode() == 'W') {
            System.out.println("IM RUNNING UPPP");
        }
        else if ( e.getKeyCode() =='D'){
            System.out.println("AHLELELEAHLELA");
        } else if (e.getKeyCode() == 'A') {

        } else if (e.getKeyCode() == 'S') {
            
        }
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
//
//    public void addNotify(){
//
//    }
}
