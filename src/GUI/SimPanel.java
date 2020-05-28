package GUI;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.JPanel;

public class SimPanel extends JPanel {
    private int[][] p;

    public SimPanel(int[][] arr) {
        this.p = arr;
        setPreferredSize(new Dimension(503, 552));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        for(int i = 0; i < 500;i+=10)
            for (int j = 0; j < 500; j += 10) {
                Rectangle2D smolBoi = new Rectangle2D.Double(1 + j, 50 + i, 10, 10);
                chooseColor(p[j][i], g);
                g2d.fill(smolBoi);
                g2d.setColor(Color.black);
                g2d.draw(smolBoi);
            }


    }

    private void chooseColor(int el, Graphics g) {
        switch (el) {
            case 0:
                g.setColor(Color.black);
                break;
            case 1:
                g.setColor(Color.blue);
                break;
            case 2:
                g.setColor(Color.red);
                break;
            case 3:
                g.setColor(Color.yellow);
                break;
        }


    }
}