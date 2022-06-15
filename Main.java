/**
 * MainDriver
 */
import javax.swing.JFrame;

public class Main 
{
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Driver driver = new Driver();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Tower defance");
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(driver);
    }
}