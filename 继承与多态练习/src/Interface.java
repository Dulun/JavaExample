import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by butter on 16-10-13.
 */
public class Interface extends Applet implements MouseListener, MouseMotionListener {

    int x1, y1, x2, y2;
    public void init() {
            addMouseListener(this);
            addMouseMotionListener((MouseMotionListener) this);
            }
    public void paint(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }

    public void mousePressed(MouseEvent e) { // 记录起点坐标
        x1=e.getX();
        y1=e.getY();
    }
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) { // 记录终点坐标
        x2=e.getX();
        y2=e.getY();
        repaint();
    }
}