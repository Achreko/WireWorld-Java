package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;

import javax.swing.*;

public class SimPanel extends JPanel implements ActionListener {
    private int p=2;
    private int gen = 0;
    private int genAmount = 50;

    Timer loop = new Timer(120,this);

    public SimPanel() {

        setPreferredSize(new Dimension(503, 552));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Font font = new Font("Serif", Font.BOLD, 30);
        g2d.setFont(font);
        g2d.setColor(Color.black);
        g2d.drawString("Numer generacji: " + gen,10, 40 );

        for(int i = 0; i < 500;i+=10)
            for (int j = 0; j < 500; j += 10) {
                Rectangle2D smolBoi = new Rectangle2D.Double(1 + j, 50 + i, 10, 10);
                chooseColor(p, g);
                g2d.fill(smolBoi);
                g2d.setColor(Color.black);
                g2d.draw(smolBoi);
            }
        loop.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(gen < genAmount){
            gen++;
            repaint();
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