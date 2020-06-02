package GUI;

import Data.*;
import Loader.Create_Board;
import Loader.Driver;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//usunąć komentarze pisane for fun

public class SavePanel extends JPanel  {
    private JButton save;
    private int savedGenNumber = 0;
    private String mightyFile;
    private int[][] mightyArray;
    private String advElems = Create_Board.getAdvElems();


    //Ojj tak tak Byczq +1
    public SavePanel(){
        save = new JButton("Zapisz");



        save.setAlignmentX(CENTER_ALIGNMENT);


        add(save);

        save.addActionListener(new Listener());


    }
    private class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ev) {
            if(ev.getSource().equals(save)) {
                savedGenNumber = SimPanel.getGenNumber();
                mightyFile = "Generacja nr "+savedGenNumber;
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
        PrintWriter dlugopis = new PrintWriter(mightyFile +".txt");

        for(int i=0; i < Objects.Getter.get_rows(); i++)
            for (int j = 0; j < Objects.Getter.get_columns(); j++) {
                if (Trans.canTransform(mightyArray[i][j])) {
                    switch(mightyArray[i][j]) {
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
    }




