package Objects;

public class ElectronHead extends Body{

    public static boolean check(int x,int y){
        if(x>=0&&x<columns&&y>=0&&y<rows) return true;
        else return false;
    }

    public static void make(int[][]k,int x,int y){
        k[y][x]=2;

    }
}
