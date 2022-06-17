import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import java.awt.event.MouseListener;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Driver extends JPanel implements KeyListener, ActionListener, MouseListener{
    private boolean play = false;

    private Timer timer;
    private int delay = 8;

    private int playerX = 310;

    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;

    private BufferedImage screen;

    public Driver(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g){ 

        try {
            screen = ImageIO.read(new File("G:/Chris/Coding/github/towerdefend game/game-project-/StartScreen.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
           //background
            g.drawImage(screen, 0, 0, this);
   
   
           g.dispose();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        timer.start();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            if(playerX >= 600){
                playerX = 600;
            }
            else{
                moveRight();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            if(playerX < 10){
                playerX = 10;
            }
            else{
                moveLeft();
            }
        }

    }
    public void moveRight(){
        play = true;
        playerX += 20;
    }
    public void moveLeft(){
        play = true;
        playerX -= 20;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}

