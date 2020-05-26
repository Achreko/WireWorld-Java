package Objects;

public class ElectronHead {

    public static boolean check_electronhead(int x,int y){
        if(x>=0&&x<50&&y>=0&&y<50) return true;
        else return false;
    }

    public static void make_electronhead(int[][]k,int x,int y){
        k[y][x]=2;

    }
}
