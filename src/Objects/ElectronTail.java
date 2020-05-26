package Objects;

public class ElectronTail {

    public static boolean check_electrontail(int x,int y){
        if(x>=0&&x<50&&y>=0&&y<50) return true;
        else return false;
    }


    public static void make_electrontail(int[][]k,int x,int y){
        k[y][x]=3;

    }
}
