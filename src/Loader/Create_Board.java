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
                        if(!ElectronHead.check_electronhead(d.data[i].x,d.data[i].y ))
                        throw new BadArgumentException("zle wsp");
                        Objects.ElectronHead.make_electronhead(k,d.data[i].x,d.data[i].y);
            }else if(d.data[i].name.equalsIgnoreCase("electrontail")){
                        if(!ElectronTail.check_electrontail(d.data[i].x,d.data[i].y ))
                        throw new BadArgumentException("zle wsp");
                        Objects.ElectronTail.make_electrontail(k,d.data[i].x,d.data[i].y);
            }else if(d.data[i].name.equalsIgnoreCase("diode")){
                        if(d.data[i].option.equalsIgnoreCase("normal")){
                                if(!Diode_N.check_diode_n(d.data[i].x,d.data[i].y))
                                throw new BadArgumentException("zle wsp");
                        Objects.Diode_N.make_diode_n(k,d.data[i].x,d.data[i].y);
                        } else if (d.data[i].option.equalsIgnoreCase("reversed")){
                                if(!Diode_R.check_diode_r(d.data[i].x,d.data[i].y))
                                throw new BadArgumentException("zle wsp");
                        Objects.Diode_R.make_diode_r(k,d.data[i].x,d.data[i].y);
                        }else{
                            throw new BadDiodeModifierException("zla dioda");
                        }
            }else if (d.data[i].name.equalsIgnoreCase("or")){
                            if(!Or_Gate.check_or_gate(d.data[i].x,d.data[i].y ))
                            throw new BadArgumentException("zle wsp");
                            Objects.Or_Gate.make_or_gate(k,d.data[i].x,d.data[i].y);
                    }else{
                            throw new BadElementException("zle dane");
            }
        }
        return k;
    }
}
