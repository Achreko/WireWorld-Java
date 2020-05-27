package Objects;

public class Xor_Gate extends Body{
    public static boolean check(int x,int y){
        if(x>=4&&x<=columns-1&&y>=2&&y<=rows-3) return true;
        else return false;
    }

    public static void make(int[][]k,int x,int y){
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
}
