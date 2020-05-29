package GUI;

import javax.swing.*;

public class SimFrame extends JFrame {
    private int[][] p;


    public SimFrame(int[][] arr) {
        super("Symulacja");

        this.p=arr;
        JPanel panel = new SimPanel(p);

        add(panel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}