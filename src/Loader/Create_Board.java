package Loader;
import Data.*;
import Exceptions.*;
import Objects.*;


public class Create_Board {


    public static int[][] check_and_load(Data  d){

        int[][] k=new int[50][50];
        for(int h=0;h<50;h++){
           for(int g=0;g<50;g++){
               k[h][g]=0;
           }
        }

        for(int i=0;i<d.getNumber_of_elements();i++){
            if(d.data[i].name.equalsIgnoreCase("electronhead")){
                        if(!ElectronHead.check(d.data[i].x,d.data[i].y ))
                        throw new BadArgumentException("zle wsp");
                        Objects.ElectronHead.make(k,d.data[i].x,d.data[i].y);
            }else if(d.data[i].name.equalsIgnoreCase("electrontail")){
                        if(!ElectronTail.check(d.data[i].x,d.data[i].y ))
                        throw new BadArgumentException("zle wsp");
                        Objects.ElectronTail.make(k,d.data[i].x,d.data[i].y);
            }else if(d.data[i].name.equalsIgnoreCase("diode")){
                        if(d.data[i].option.equalsIgnoreCase("normal")){
                                if(!Diode_N.check(d.data[i].x,d.data[i].y))
                                throw new BadArgumentException("zle wsp");
                        Objects.Diode_N.make(k,d.data[i].x,d.data[i].y);
                        } else if (d.data[i].option.equalsIgnoreCase("reversed")){
                                if(!Diode_R.check(d.data[i].x,d.data[i].y))
                                throw new BadArgumentException("zle wsp");
                        Objects.Diode_R.make(k,d.data[i].x,d.data[i].y);
                        }else{
                            throw new BadDiodeModifierException("zla dioda");
                        }
            }else if (d.data[i].name.equalsIgnoreCase("or")){
                            if(!Or_Gate.check(d.data[i].x,d.data[i].y ))
                            throw new BadArgumentException("zle wsp");
                            Objects.Or_Gate.make(k,d.data[i].x,d.data[i].y);
                    } else if(d.data[i].name.equalsIgnoreCase("copper")){
                            if(!Copper.check(d.data[i].x,d.data[i].y ))
                            throw new BadArgumentException("zle wsp");
                            Objects.Copper.make(k,d.data[i].x,d.data[i].y);
            } else if(d.data[i].name.equalsIgnoreCase("xor")){
                             if(!Xor_Gate.check(d.data[i].x,d.data[i].y ))
                             throw new BadArgumentException("zle wsp");
                             Objects.Xor_Gate.make(k,d.data[i].x,d.data[i].y);
            } else {
                            throw new BadElementException("zle dane");
            }
        }
        return k;
    }
}
