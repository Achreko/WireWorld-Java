import GUI.GUI;
import Objects.Getter;
import GUI.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
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

    public int getNumber(){ return number;}
    public String getPath(){return file;}

    private class Listener implements ActionListener, KeyListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource().equals(close)) {
                System.exit(0);
            } else if (e.getSource().equals(accept)) {
                number = (Integer.parseInt(text.getText()));
                System.out.println(number);
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

                    //stworzy plansze na podstawie danych z pliku
                    int [][] t=new int[Objects.Getter.get_rows()][Objects.Getter.get_columns()];
                    t=Loader.Create_Board.perform(file);
                    /*poczatek do usuniecia*/
    /*to tylko pokazuje plansze */
                    for (int i = 0; i < Getter.get_rows(); i++) {
                        for (int j=0;j<Getter.get_columns();j++){
                            System.out.print(t[i][j]);
                        }
                        System.out.print('\n');
                    }
                    /*koniec do usuniecia*/




                    choose.setVisible(false);
                    label2.setVisible(false);
                    close.setVisible(false);


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




    public static void main(String[] args) {
        Driver m = new Driver("WireWorld");
        m.setSize(400, 400);
        m.setVisible(true);
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new SimFrame();

            }
        });

    }
}


