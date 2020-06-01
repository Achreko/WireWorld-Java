package GUI;

import javax.swing.*;
import java.awt.*;

public class SimFrame extends JFrame {
    private final JSplitPane splitPane;


    public SimFrame(String f) {
        super("WireWorld simulation");

        splitPane= new JSplitPane();

        JPanel simPanel = new SimPanel(f);
        JPanel savePanel = new SavePanel();


        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setDividerLocation(503);
        splitPane.setLeftComponent(simPanel);
        splitPane.setRightComponent(savePanel);


        simPanel.setMinimumSize(new Dimension(503, 552));

        savePanel.setLayout(new BoxLayout(savePanel,BoxLayout.X_AXIS));

        add(splitPane);

        setResizable(false);


        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }


}