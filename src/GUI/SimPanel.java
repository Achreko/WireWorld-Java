package GUI;

import Data.Trans;
import Loader.Driver;
import Loader.Create_Board;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;



import javax.swing.*;

public class SimPanel extends JPanel implements ActionListener {
    private static int[][] p;
    private static int gen = 0;
    private int genAmount = Driver.getNumber();



    Timer loop = new Timer(1500,this);


    public SimPanel(String f) {
        p = Create_Board.perform(f);
        setPreferredSize(new Dimension(503, 552));
    }

    public  void setGen(){
        this.gen=0;
        this.genAmount=0;
    }
        @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Font font = new Font("Serif", Font.BOLD, 30);
        g2d.setFont(font);
        g2d.setColor(Color.black);
        g2d.drawString("Numer generacji: " + gen,10, 40 );

        for(int i = 0; i < Objects.Getter.get_rows();i++)
            for (int j = 0; j < Objects.Getter.get_columns(); j++) {
                Rectangle2D smolBoi = new Rectangle2D.Double(1 + 10 * j, 50 + 10 * i, 10, 10);
                chooseColor(p[i][j], g);
                g2d.fill(smolBoi);
                g2d.setColor(Color.black);
                g2d.draw(smolBoi);
            }



        loop.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (gen < genAmount) {
            gen++;
            Trans.setTransformation(p);
            repaint();
        }
    }

    public static int getGenNumber() {
        return gen;
    }

    public static int[][] passArray() {
        return p;
    }




    private void chooseColor(int el, Graphics g) {
        switch (el) {
            case 0:
                g.setColor(Color.black);
                break;
            case 1:
                g.setColor(Color.yellow);
                break;
            case 2:
                g.setColor(Color.blue);
                break;
            case 3:
                g.setColor(Color.red);
                break;
        }


    }

   
}