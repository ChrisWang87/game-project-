import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;

public class MouseHandler implements MouseInputListener
{
    public boolean leftclick, rightclick;

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        int click = e.getButton();

        if(click == MouseEvent.BUTTON1)
        {
            leftclick = true;
        }
        if(click == MouseEvent.BUTTON3)
        {
            rightclick = true;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        int click = e.getButton();

        if(click == MouseEvent.BUTTON1)
        {
            leftclick = false;
        }
        if(click == MouseEvent.BUTTON3)
        {
            rightclick = false;
        }
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

