package GUI;

import javax.swing.*;

public class SimFrame extends JFrame {



    public SimFrame() {
        super("Symulacja");


        JPanel panel = new SimPanel();

        add(panel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


}