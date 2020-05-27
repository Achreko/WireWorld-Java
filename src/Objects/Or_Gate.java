package Objects;

import Exceptions.BadArgumentException;

public class Or_Gate extends Body{

    private static void make(int[][] k,int x,int y){
        if(k[y][x]==0)
        k[y][x]=1;
        if(k[y-1][x]==0)
        k[y-1][x]=1;
        if(k[y][x-1]==0)
        k[y][x-1]=1;
        if(k[y+1][x]==0)
        k[y+1][x]=1;
        if(k[y][x+1]==0)
        k[y][x+1]=1;

    }

    private static boolean check(int x,int y){
        if(x>=1&&x<=columns-2&&y>=1&&y<=rows-2) return true;
        else return false;
    }

    public static void perform(int[][]k,int x,int y){
        if(!check(x,y ))
            throw new BadArgumentException("zle wsp");
        make(k,x,y);
    }
}
