package GUI;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

public class Main_GUI extends JFrame {

    protected JPanel panel;
    protected JTextField text;      // bierze liczbe generacji do wykonania
    protected JButton close;        // konczy prace programu
    protected JButton accept;       // akcptuje liczbe generacji
    protected JLabel label;         // pytanie o liczbe generacji
    protected int number;           // liczba generacji zapisana w postaci calkowitej

    protected JButton choose;       //wybor pliku do wczytania
    protected JFileChooser fc;      //okno wyboru pliku
    protected JLabel label2;        // polecenie wybrania pliku
    protected String file=null;     // sciezka do pliku zapisana w formacie string


     public Main_GUI(String name){
        super(name);

        // panel
        panel =new JPanel();
        panel.setBounds(40,80,200,200);
        panel.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel);
        this.pack();
        panel.setVisible(true);

        // poszczegolne elementy

        text = new JTextField();
        text.setBounds(200, 50, 150, 30);

        close=new JButton("Zakończ");
        close.setBounds(200, 100, 150, 30);

        accept=new JButton("Zatwierdź");
        accept.setBounds(50, 100, 150, 30);
        accept.setEnabled(false);

        label=new JLabel("Podaj liczbę generacji");
        label.setBounds(50, 50, 150, 30);

        choose = new JButton("Wybierz");
        choose.setBounds(50, 100, 150, 30);
        choose.setVisible(false);

        label2 = new JLabel("Wybierz plik z danymi");
        label2.setBounds(50, 50, 150, 30);
        label2.setVisible(false);

     // dodanie action listenerow
        text.addKeyListener(new Listener());
        close.addActionListener(new Listener());
        accept.addActionListener(new Listener());
        choose.addActionListener(new Listener());


        // dodawanie elementow do panelu

        panel.add(text);
        panel.add(label);
        panel.add(close);
        panel.add(accept);
        panel.add(choose);
        panel.add(label2);

    }

    private class Listener implements ActionListener, KeyListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource().equals(close)) {
                System.exit(0);
            } else if (e.getSource().equals(accept)) {
                number = (Integer.parseInt(text.getText()));
                if(number < 1)
                    System.exit(1);
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
                    choose.setVisible(false);
                    label2.setVisible(false);
                }
            }
        }

        @Override
        public void keyTyped (KeyEvent e ) {
            if (!Character.isDigit(e.getKeyChar()))
                e.consume();
            if (Character.isDigit(e.getKeyChar()))
                accept.setEnabled(true);
        }

        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {}

    }

    protected String getFilePath(){
            return fc.getSelectedFile().getAbsolutePath();
        }

     public int getNumber(){ return this.number;}
     public String getPath(){return file;}

/*
    public static void main(String[] args) {
        Main_GUI m = new Main_GUI("ooo");
        m.setSize(400, 400);
        m.setVisible(true);


    }*/
}
