package Objects;

import Exceptions.BadArgumentException;

public class Diode_R extends Body {

    private static void make(int[][] k,int x,int y){
        if(k[y][x]==0)
            k[y][x]=1;
        if(k[y-1][x-1]==0)
            k[y-1][x-1]=1;
        if( k[y][x-1]==0)
            k[y][x-1]=1;
        if(k[y+1][x-1]==0)
            k[y+1][x-1]=1;
        if(k[y+1][x-2]==0)
            k[y+1][x-2]=1;
        if( k[y-1][x-2]==0)
            k[y-1][x-2]=1;
        if(k[y][x-3]==0)
            k[y][x-3]=1;
    }

    private static boolean check(int x,int y){
        if(x>=3&&x<=columns-1&&y>=1&&y<=rows-2) return true;
        else return false;
    }

    public static void perform(int[][]k,int x,int y){
        if(!check(x,y ))
            throw new BadArgumentException();
        make(k,x,y);
    }
}
