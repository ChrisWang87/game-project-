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

    try {
        logo = ImageIO.read(new File("G:/Chris/Coding/visual studio/battle ship example/Logo.png"));
    } catch (IOException e) {
        e.printStackTrace();
    }

    public UI(Driver gp)
    {
        this.gp = gp;
        arial_40 = new Font("Arial", Font.PLAIN, 40);
    }
    public void draw(Graphics g)
    {
        g.setFont(arial_40);
        g.setColor(Color.black);
        g.drawString("Start",700,750);
    }

    public void draw(Graphics2D g2)
    {
        this.g2 = g2;
        //titleScrren
        if(gp.gameState == gp.titleScrenn)
        {
            drawTitleScrren();
        }
        
    }
    public void drawTitleScrren()
    {
        //title
        g2.setFont(g2.getFont().deriveFont(Font.BOLD,96F));
        String text = "adventrue";
        g2.setColor(Color.black);
        g2.drawString(text,500,200);


    }



}
