package Objects;

public class Diode_R {

    static void make_diode_r(int[][] k,int x,int y){
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
}
