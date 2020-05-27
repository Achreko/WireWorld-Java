package Objects;

public class Copper extends Body {

    public static boolean check(int x,int y){
        if(x>=0&&x<columns&&y>=0&&y<rows) return true;
        else return false;
    }

    public static void make(int[][]k,int x,int y){
        if(k[y][x]==0)
        k[y][x]=1;

    }
}
