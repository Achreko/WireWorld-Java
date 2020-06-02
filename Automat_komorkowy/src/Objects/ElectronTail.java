package Objects;

import Exceptions.BadArgumentException;

public class ElectronTail extends Body {

    private static boolean check(int x,int y){
        if(x>=0&&x<columns&&y>=0&&y<rows) return true;
        else return false;
    }


    private static void make(int[][]k,int x,int y){
        k[y][x]=3;

    }

    public static void perform(int[][]k,int x,int y){
        if(!check(x,y ))
            throw new BadArgumentException();
        make(k,x,y);
    }
}
