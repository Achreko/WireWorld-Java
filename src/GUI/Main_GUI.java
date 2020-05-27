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

        // dodawanie elementow do panelu

        panel.add(text);
        panel.add(label);
        panel.add(close);
        panel.add(accept);
        panel.add(choose);
        panel.add(label2);

    }


}
