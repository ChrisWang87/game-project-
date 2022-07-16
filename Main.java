/**
 * MainDriver
 */
import javax.swing.JFrame;

public class Main extends JFrame 
{
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Driver driver = new Driver();
        obj.add(driver);
        obj.pack();
        obj.setTitle("Tower defense");
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setLocationRelativeTo(null);
    }
}