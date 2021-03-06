import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;



public class UI 
{
    Driver gp;
    Font arial_40;
    Graphics2D g2;
    public int commandNum = 0;

    private BufferedImage titlescreen;



    public UI(Driver gp)
    {
        this.gp = gp;
        arial_40 = new Font("Arial", Font.PLAIN, 40);
    }

    public void draw(Graphics2D g2)
    {
        this.g2 = g2;
        //titleScrren
        if(gp.gameState == gp.titleScrenn)
        {
            drawTitleScrren();
        }
        if(gp.gameState == gp.MainScreen)
        {
            drawMainScreen();
        }
          
    }
    public void drawTitleScrren()
    {
        try {
            titlescreen = ImageIO.read(new File("G:/Desktop/Chris/Coding/github/towerdefend game/game-project-/image_and_object/StartScreen.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g2.drawImage(titlescreen, 0, 0, null);
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,96F));
        String text = "Game start";
        g2.setColor(Color.black);
        g2.drawString(text,470,100);
        //title 
    }
    public void drawMainScreen()
    {
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,96F));
        String text = "Game start";
        g2.setColor(Color.black);
        g2.drawString(text,500,200); 
    }



}
