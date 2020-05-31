package Data;


public class Trans {

    // sprawdza, czy blank
    public static boolean canTransform(int el){
        return el != 0;
    }

    // sprawdza, czy jest 1 lub 2 electron heady obok
    public static boolean happyLittleFriend(int[][] array, int x, int y){
        int friends = 0;
            for (int i = x - 1; i < x + 2; i++) {
                for (int j = y - 1; j < y + 2; j++) {
                    if(i>=0 && i<Objects.Getter.get_rows()-1 && j>=0 && i<Objects.Getter.get_columns()-1) {
                        if (array[i][j] == 2)
                            friends++;
                    }
                }
            }


        return friends == 1 || friends == 2;
    }

    public  static int[][] setTransformation(int[][] array){
       int[][] temp = new int[Objects.Getter.get_rows()][Objects.Getter.get_columns()];
        copy(array,temp);
        for(int i = 0; i < Objects.Getter.get_rows(); i++) {
            for (int j = 0; j < Objects.Getter.get_columns(); j++) {
                if (canTransform(temp[i][j])) {
                    if (temp[i][j] == 2)
                        array[i][j] = 3;
                    else if (temp[i][j] == 3)
                        array[i][j] = 1;
                    else if (temp[i][j] == 1) {
                        if (happyLittleFriend(temp, i, j))
                            array[i][j] = 2;
                    }

                }

            }
        }
        return array;
    }

    private static void copy(int[][] t,int[][]t2) {
        try {
            for (int i = 0; i < Objects.Getter.get_rows() -1 ; i++)
                for (int j = 0; i < Objects.Getter.get_columns() -1 ; j++)
                    t2[i][j] = t[i][j];
        } catch(ArrayIndexOutOfBoundsException e){
            e.getStackTrace();
        }
    }

    }


