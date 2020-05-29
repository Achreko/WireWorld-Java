package Loader;
import Data.*;
import Exceptions.*;
import Objects.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Create_Board  {


    public static int[][] check_and_load(Data  d){

        int[][] k=new int[Getter.get_rows()][Getter.get_columns()];
        for(int h=0;h<Getter.get_rows();h++){
           for(int g=0;g<Getter.get_columns();g++){
               k[h][g]=0;
           }
        }

        for(int i=0;i<d.getNumber_of_elements();i++){
            if(d.data[i].name.equalsIgnoreCase("electronhead")){
                ElectronHead.perform(k,d.data[i].x,d.data[i].y);
            }else if(d.data[i].name.equalsIgnoreCase("electrontail")){
                ElectronTail.perform(k,d.data[i].x,d.data[i].y);
            }else if(d.data[i].name.equalsIgnoreCase("diode")){
                        if(d.data[i].option.equalsIgnoreCase("normal")){
                            Diode_N.perform(k,d.data[i].x,d.data[i].y);
                        } else if (d.data[i].option.equalsIgnoreCase("reversed")){
                            Diode_R.perform(k,d.data[i].x,d.data[i].y);
                        }else{
                            throw new BadDiodeModifierException("zla dioda");
                        }
            }else if (d.data[i].name.equalsIgnoreCase("or")){
                Or_Gate.perform(k,d.data[i].x,d.data[i].y);
                    } else if(d.data[i].name.equalsIgnoreCase("copper")){
                Copper.perform(k,d.data[i].x,d.data[i].y);
            } else if(d.data[i].name.equalsIgnoreCase("xor")){
                Xor_Gate.perform(k,d.data[i].x,d.data[i].y);
            } else {
                            throw new BadElementException("zle dane");
            }
        }
        return k;
    }




    public static Data readData(String path) throws IOException {
        Data d = new Data();
        FileReader fr = new FileReader(path);
        BufferedReader b = new BufferedReader(fr);
        String line = null;
        while ((line = b.readLine()) != null) {
            String[] k = line.split("\\s+");
            try {
                if (k.length == 4) {

                    Element e = new Element(k[0], k[3], Integer.parseInt(k[1]), Integer.parseInt(k[2]));
                    d.addElement(e);

                } else if (k.length == 3) {
                    Element e = new Element(k[0], Integer.parseInt(k[1]), Integer.parseInt(k[2]));
                    d.addElement(e);
                }
            } catch (NumberFormatException j) {
                System.out.println("eee");
            }
        }
        return d;
    }
}
