import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;


public class Driver extends JPanel implements Runnable{

    final int originalTileSize = 20;
    final int scale = 1;

    final int tileSize = originalTileSize * scale; 
    final int Screencol = 72;
    final int Screenrwo = 45;
    final int screenWidth = tileSize * Screencol;
    final int screenHeight = tileSize * Screenrwo;

    Thread gameThread;



    //System
    public UI ui = new UI(this);



    //game state
    public int gameState;
    public final int titleScrenn = 0;
    public final int MainScreen = 1;


    public Driver()
    {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));  
    }


    public void paint(Graphics g){ 
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        
            //titleScrren
            if(gameState == titleScrenn)
            {
              ui.draw(g2);
            }
            else
            {

            }
    }
    public void setupGame()
    {
        gameState = titleScrenn;
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
    public void paintEnemy(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

    }
    public void moveup()
    {

    }
    
}

