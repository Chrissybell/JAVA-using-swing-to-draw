import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

public class Exercise01 extends JFrame {


    public static void Jframee() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("LabelCoord");
        frame.setSize(800, 800);


        final MouseLabel label = new MouseLabel();
        JLayeredPane layered_pane = frame.getRootPane().getLayeredPane();
        layered_pane.add(label, JLayeredPane.DRAG_LAYER);
        label.setBounds(-55, -30, frame.getWidth(), frame.getHeight());
        frame.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                label.x1 = e.getX();
                label.y1 = e.getY();
                label.repaint();
            }
        });
        frame.setVisible(true);
    }
    private static class MouseLabel extends JComponent {
        public int x1;
        public int y1;

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            String coord = "(" + x1 + "." + y1 + ")";
            g.drawString(coord, x1, y1);
        }
    }
    public static void main(String[] args) {
        Jframee();
    }
}