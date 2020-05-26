package Loader;
import Data.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Load {
    public static Data readData(String path) throws IOException {
        Data d = new Data();
        FileReader fr = new FileReader(path);
        BufferedReader b = new BufferedReader(fr);
        String line = null;
        while ((line = b.readLine()) != null) {
            String[] k = line.split("\\s+");
            try {
                if (k.length == 4) {

                    Element e = new Element(k[0], k[1], Integer.parseInt(k[2]), Integer.parseInt(k[3]));
                    d.addElement(e);

                } else if (k.length == 3) {
                    Element e = new Element(k[0], Integer.parseInt(k[1]), Integer.parseInt(k[2]));
                    d.addElement(e);
                }
            } catch (NumberFormatException j) {

            }
        }
        return d;
    }

    private boolean Diode_N(int x, int y){
        if(x>=0&&x<=46&&y>=1&&y<=48) return true;
        else return false;
    }

    private boolean Diode_R(int x,int y){
        if(x>=3&&x<=49&&y>=1&&y<=48) return true;
        else return false;
    }

}


