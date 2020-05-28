package Data;

import Objects.*;

public class Trans {

    // sprawdza, czy blank
    public static boolean canTransform(int el){
        if (el == 0) {
            return false;
        }
        return true;
    }

    // sprawdza, czy jest 1 lub 2 electron heady obok
    public static boolean happyLittleFriend(int[][] array, int x, int y){
        int friends = 0;
        try {
            for (int i = x - 1; i < x + 2; i++)
                for (int j = y - 1; j < y + 2; j++)
                    if(array[i][j] == 2)
                        friends++;

        } catch(ArrayIndexOutOfBoundsException e){
            //sad face :(
        }
        if(friends == 1 || friends == 2)
            return true;
        return false;
    }

    public static int[][] setTransformation(int[][] array){

        int[][] array2=new int[Objects.Getter.get_rows()][Objects.Getter.get_columns()];
        copy(array,array2);
        for(int i = 0; i < 50; i++)
            for( int j =0; j < 50; j++) {
                if(canTransform(array2[i][j])){
                if(array2[i][j] == 2)
                    array[i][j] = 3;
                else if(array2[i][j] == 3)
                    array[i][j] = 1;
                else if (array2[i][j] == 1 ) {
                    if (happyLittleFriend(array2,i, j))
                        array[i][j] = 2;
                }
            }
        }
        return array;
    }

    private static void copy(int[][] t,int[][]t2){
        for(int i=0;i<Objects.Getter.get_rows();i++){
            for(int j=0;i<Objects.Getter.get_columns();j++){
                t2[i][j]=t[i][j];
            }
        }
    }


}
