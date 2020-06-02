package GUI;

import Data.*;
import Loader.Create_Board;
import Loader.Driver;
import Objects.Diode_N;
import Objects.Or_Gate;
import Objects.Xor_Gate;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//usunąć komentarze pisane for fun

public class SavePanel extends JPanel {
    private JButton save;
    private int savedGenNumber = 0;
    private String mightyFile;
    private int[][] mightyArray;
    private String advElems = Create_Board.getAdvElems();


    //Ojj tak tak Byczq +1
    public SavePanel() {
        save = new JButton("Zapisz");


        save.setAlignmentX(CENTER_ALIGNMENT);


        add(save);

        save.addActionListener(new Listener());


    }

    private class Listener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ev) {
            if (ev.getSource().equals(save)) {

                savedGenNumber = SimPanel.getGenNumber();
                mightyFile = "Generacja nr " + savedGenNumber;

                mightyArray = SimPanel.passArray();
                try {
                    toFile();
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
            }
        }

    }

    public void toFile() throws FileNotFoundException {
        PrintWriter dlugopis = new PrintWriter(mightyFile + ".txt");
        int[][] t = new int[Objects.Getter.get_rows()][Objects.Getter.get_columns()];
        for (int i = 0; i <= Objects.Getter.get_rows() - 1; i++) {
            for (int j = 0; j <= Objects.Getter.get_columns() - 1; j++) {
                t[i][j] = mightyArray[i][j];
            }
        }

        damn(t, dlugopis);


        for (int i = 0; i < Objects.Getter.get_rows(); i++)
            for (int j = 0; j < Objects.Getter.get_columns(); j++) {
                if (Trans.canTransform(t[i][j])) {

                    switch (t[i][j]) {
                        case 1:
                            dlugopis.print("copper ");
                            break;
                        case 2:
                            dlugopis.print("electronhead ");
                            break;
                        case 3:
                            dlugopis.print("electrontail ");
                            break;
                    }
                    dlugopis.print(j);
                    dlugopis.print(" ");
                    dlugopis.println(i);

                }

            }
        // Trzeba zamknąć, bo inaczej program się na twarz wywali
        dlugopis.close();
    }


    public static void damn(int[][] t, PrintWriter p) {

        Data d = Create_Board.getData();
        for (int i = 0; i < d.getNumber_of_elements(); i++) {
            if (d.data[i].name.equalsIgnoreCase("or")) {
                Objects.Or_Gate.isOrGate(t, d.data[i].x, d.data[i].y);
                p.println("Or " + d.data[i].x + " " + d.data[i].y);
            } else if (d.data[i].name.equalsIgnoreCase("Diode")) {
                if (d.data[i].option.equalsIgnoreCase("normal")) {
                    Objects.Diode_N.isDiode_N(t, d.data[i].x, d.data[i].y);
                    p.println("Diode " + d.data[i].x + " " + d.data[i].y + " Normal");
                } else if (d.data[i].option.equalsIgnoreCase("Reversed")) {
                    Objects.Diode_R.isDiode_R(t, d.data[i].x, d.data[i].y);
                    p.println("Diode " + d.data[i].x + " " + d.data[i].y + " Reversed");
                }
            } else if (d.data[i].name.equalsIgnoreCase("xor")) {
                Objects.Xor_Gate.isOrGate(t, d.data[i].x, d.data[i].y);
                p.println("Xor " + d.data[i].x + " " + d.data[i].y);
            }


        }
    }

}








