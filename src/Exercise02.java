import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Rectangle2D;


public class Exercise02 extends JFrame {
    private static final int win_width = 800;
    private static final int win_height = 800;
    private static final int socket_height = 150;
    private static final int socket_width_margin = 125;
    private static final int Left_Radius = 50;
    private static final int Right_Radius = 20;
    private Eyeclass[] Eyeclass;
    private static DrawingPanel drawingPanel;


    public Exercise02() {
        this.Eyeclass = new Eyeclass[2];
        this.Eyeclass[0] = new Eyeclass(new Point(socket_width_margin, socket_height));
        this.Eyeclass[1] = new Eyeclass(new Point(win_width - socket_width_margin, socket_height));

    }

    public void run() {
        JPanel window = new JPanel();
        JFrame frame = new JFrame("Googly eyes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(window);
        frame.setVisible(true);
        frame.setSize(800, 800);
        drawingPanel = new DrawingPanel();
        frame.add(drawingPanel);
    }

    private class DrawingPanel extends JPanel {


        public DrawingPanel() {
            this.addMouseMotionListener(new EyeListener());
            this.setBackground(Color.WHITE);
            this.setPreferredSize(new Dimension(win_width, win_height));
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLACK);

            for (Eyeclass eye : Eyeclass) {
                drawCircle(g, eye.getOrigin(), Left_Radius);
                fillCircle(g, eye.getInit_point(), Right_Radius);
            }
        }

        private void drawCircle(Graphics g, Point Origin, int radius) {
            g.drawOval(Origin.x - radius, Origin.y - radius, radius + radius,
                    radius + radius);
        }

        private void fillCircle(Graphics g, Point Origin, int radius) {
            g.fillOval(Origin.x - radius, Origin.y - radius, radius + radius,
                    radius + radius);
        }


    }

    public class EyeListener extends MouseMotionAdapter {
        private final double eye_distance = Left_Radius - Right_Radius - 5;

        @Override
        public void mouseMoved(MouseEvent event) {
            Point p = event.getPoint();
            for (Eyeclass eye : Eyeclass) {
                Point origin = eye.getOrigin();
                double theta = Math.atan2(p.y - origin.y, p.x - origin.x);
                int x = (int) Math.round(Math.cos(theta) * eye_distance) + origin.x;
                int y = (int) Math.round(Math.sin(theta) * eye_distance) + origin.y;
                eye.setInit_Point(new Point(x, y));
            }

            drawingPanel.repaint();
        }
    }
}
