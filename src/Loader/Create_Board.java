package Loader;
import Data.*;
import Exceptions.*;
import Objects.*;


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
}
