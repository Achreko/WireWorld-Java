package Objects;

public class Diode_N extends Body {

   public static void make(int[][] k,int x,int y){
            if(k[y][x]==0)
            k[y][x]=1;
            if(k[y-1][x+1]==0)
            k[y-1][x+1]=1;
            if(k[y][x+1]==0)
            k[y][x+1]=1;
            if(k[y+1][x+1]==0)
            k[y+1][x+1]=1;
            if(k[y+1][x+2]==0)
            k[y+1][x+2]=1;
            if(k[y-1][x+2]==0)
            k[y-1][x+2]=1;
            if(k[y][x+3]==0)
            k[y][x+3]=1;

    }


    public static boolean check(int x,int y){
        if(x>=0&&x<=columns-4&&y>=1&&y<=rows-2) return true;
        else return false;
    }
}
