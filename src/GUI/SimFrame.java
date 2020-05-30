package GUI;

import javax.swing.*;

public class SimFrame extends JFrame {


    public SimFrame(String f) {
        super("WireWorld simulation");


        JPanel panel = new SimPanel(f);

        add(panel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }


}