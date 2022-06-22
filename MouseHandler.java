import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;

public class MouseHandler implements MouseInputListener
{
    public boolean leftclick, rightclick;
    public int x,y;


    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        int x = e.getY();
        int y = e.getX();

        System.out.println(x + ", " + y);
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

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}

