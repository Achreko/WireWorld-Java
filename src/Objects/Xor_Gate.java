package Objects;

import Exceptions.BadArgumentException;

public class Xor_Gate extends Body{
    private static boolean check(int x,int y){
        if(x>=4&&x<=columns-1&&y>=2&&y<=rows-3) return true;
        else return false;
    }

    private static void make(int[][]k,int x,int y){
       if(k[y][x]==0)
           k[y][x]=1;
        if(k[y-1][x-1]==0)
            k[y-1][x-1]=1;
        if(k[y][x-1]==0)
            k[y][x-1]=1;
        if(k[y+1][x-1]==0)
            k[y+1][x-1]=1;
        if(k[y-1][x-2]==0)
            k[y-1][x-2]=1;
        if(k[y+1][x-2]==0)
            k[y+1][x-2]=1;
        if(k[y-1][x-3]==0)
            k[y-1][x-3]=1;
        if(k[y+1][x-3]==0)
            k[y+1][x-3]=1;
        if(k[y-2][x-3]==0)
            k[y-2][x-3]=1;
        if(k[y+2][x-3]==0)
            k[y+2][x-3]=1;
        if(k[y-1][x-4]==0)
            k[y-1][x-4]=1;
        if(k[y][x-4]==0)
            k[y][x-4]=1;
        if(k[y+1][x-4]==0)
            k[y+1][x-4]=1;

    }

    public static void perform(int[][]k,int x,int y){
        if(!check(x,y ))
            throw new BadArgumentException();
        make(k,x,y);
    }


    public static boolean isOrGate_check(int[][] k, int x, int y) {
        if (check(x, y)) {
            if ( k[y][x]==1&&k[y-1][x]==1&&k[y][x-1]==1&&k[y+1][x]==1&&k[y][x+1]==1) {
                return true;
            }

        }
        return false;
    }

    public static void isOrGate(int[][] k, int x, int y) {
        if(k[y][x]==1)
            k[y][x]=0;
        if(k[y-1][x-1]==1)
            k[y-1][x-1]=0;
        if(k[y][x-1]==1)
            k[y][x-1]=0;
        if(k[y+1][x-1]==1)
            k[y+1][x-1]=0;
        if(k[y-1][x-2]==1)
            k[y-1][x-2]=0;
        if(k[y+1][x-2]==1)
            k[y+1][x-2]=0;
        if(k[y-1][x-3]==1)
            k[y-1][x-3]=0;
        if(k[y+1][x-3]==1)
            k[y+1][x-3]=0;
        if(k[y-2][x-3]==1)
            k[y-2][x-3]=0;
        if(k[y+2][x-3]==1)
            k[y+2][x-3]=0;
        if(k[y-1][x-4]==1)
            k[y-1][x-4]=0;
        if(k[y][x-4]==1)
            k[y][x-4]=0;
        if(k[y+1][x-4]==1)
            k[y+1][x-4]=0;




    }
}
