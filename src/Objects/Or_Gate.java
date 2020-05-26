package Objects;

public class Or_Gate {

    static void make_or_gate(int[][] k,int x,int y){
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
}
