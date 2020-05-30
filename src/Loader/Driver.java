package Loader;

import GUI.GUI;
import GUI.SimFrame;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

public class Driver extends GUI {

    public Driver(String name) {
        super(name);

        text.addKeyListener(new Listener());
        close.addActionListener(new Listener());
        accept.addActionListener(new Listener());
        choose.addActionListener(new Listener());

    }

    protected String getFilePath(){
        return fc.getSelectedFile().getAbsolutePath();
    }

    public static int getNumber(){ return number;}
    public  String getPath(){return file;}

    private class Listener implements ActionListener, KeyListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource().equals(close)) {
                System.exit(0);
            } else if (e.getSource().equals(accept)) {
                number = (Integer.parseInt(text.getText()));
                accept.setVisible(false);
                text.setVisible(false);
                label.setVisible(false);
                choose.setVisible(true);
                label2.setVisible(true);
            } else if (e.getSource().equals(choose)) {
                JButton b = new JButton();
                fc = new JFileChooser();
                fc.setCurrentDirectory(new File("."));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
                fc.setFileFilter(filter);

                if (fc.showOpenDialog(b) == JFileChooser.APPROVE_OPTION) {
                    file = getFilePath();


                    close();
                    SimFrame simFrame = new SimFrame(file);

                }
            }
        }



        @Override
        public void keyTyped (KeyEvent e ) {


            if (!Character.isDigit(e.getKeyChar())) {
                e.consume();
            }
            if (Character.isDigit(e.getKeyChar())) {
                accept.setEnabled(true);
            }


        }

        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {}

    }

    public static void main(String[] args){
        Driver d=new Driver("test");
        d.setSize(400,400);
        d.setVisible(true);
    }

}


