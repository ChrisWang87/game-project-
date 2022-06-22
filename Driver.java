import javax.swing.JPanel;

import Object.enemy1;

import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Graphics2D;


public class Driver extends JPanel implements Runnable{

    final int squareSize = 20;
    final int scale = 1;

    final int tileSize = squareSize * scale; 
    final int Screencol = 72;
    final int Screenrwo = 45;
    final int screenWidth = tileSize * Screencol;
    final int screenHeight = tileSize * Screenrwo;


    Thread gameThread;
    MouseHandler g;



    //System
    public UI ui = new UI(this);
    public MouseHandler mouseH = new MouseHandler();

    enemy1 Enemy = new enemy1();




    //game state
    public int gameState;
    public final int titleScrenn = 0;
    public final int MainScreen = 1;

    int enemy1Speed =  1;


    public Driver()
    {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight)); 
        this.addMouseListener(mouseH);
        this.setFocusable(true); 
    }


    public void paint(Graphics g){ 
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
            //titleScrren
            if(gameState == titleScrenn)
            { 
              ui.draw(g2);
            }
    }
    public void setupGame()
    {
        gameState = MainScreen;
        if(gameState == MainScreen)
        {
            if(g.x > 500 && g.y > 200)
            gameState = titleScrenn;
        }
    }

    public void startGameThread()
    {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run()
    {
     while(gameThread != null)
     {
        update();
        repaint();
     }   
        
    }
    public void update()
    {
        

    }
    public void paintEnemy1(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

    }

    
}

