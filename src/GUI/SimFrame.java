package GUI;

import javax.swing.*;

public class SimFrame extends JFrame {
    private int[][] p;
    private JLabel label;

    public SimFrame(int[][] arr) {
        super("Symulacja");

        this.p=arr;
        JPanel panel = new SimPanel(p);

        addLabel(0);
        add(panel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void addLabel(int number) {
        label = new JLabel("Numer generacji: " + number );
        label.setBounds(200, 10, 150, 30);
        add(label);
    }
}