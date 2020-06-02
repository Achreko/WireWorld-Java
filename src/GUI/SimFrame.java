package GUI;

import Loader.Driver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimFrame extends JFrame  {
    private final JSplitPane splitPane;
    private JButton again;


    public SimFrame(String f) {
        super("WireWorld simulation");

        splitPane= new JSplitPane();

        JPanel simPanel = new SimPanel(f);
        JPanel savePanel = new SavePanel();
        JButton again=new JButton("Początek");

        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(503);
        splitPane.setLeftComponent(simPanel);
        splitPane.setRightComponent(savePanel);

        savePanel.add(again);

        again.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("eee");
                Driver m = new Driver("WireWorld setup");
                m.setSize(400, 400);
                m.setVisible(true);
                m.setLocationRelativeTo(null);
                dispose();
            }
        });
        simPanel.setMinimumSize(new Dimension(503, 552));

        savePanel.setLayout(new BoxLayout(savePanel,BoxLayout.X_AXIS));

        add(splitPane);

        setResizable(false);


        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);



    }




}