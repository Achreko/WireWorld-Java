package Objects;

public class Diode_N {

   public static void make_diode_n(int[][] k,int x,int y){
        if(x>=0&&x<=46&&y>=1&&y<=48){
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
    }


    public static boolean check_diode_n(int x,int y){
        if(x>=0&&x<=46&&y>=1&&y<=48) return true;
        else return false;
    }
}
