package Data;


public class Trans {
    private int[][] array;

    public Trans (int[][] array) {
        this.array = array;

        setTransformation(array);
    }


    // sprawdza, czy blank
    public boolean canTransform(int el){
        if (el == 0) {
            return false;
        }
        return true;
    }

    public boolean happyLittleFriend(int x, int y){
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

    public void setTransformation(int[][] array){
        for(int i = 0; i < 50; i++)
            for( int j =0; j < 50; j++) {
                if(canTransform(array[i][j])){
                if(array[i][j] == 2)
                    this.array[i][j] = 3;
                else if(array[i][j] == 3)
                    this.array[i][j] = 1;
                else if (array[i][j] == 1 ) {
                    if (happyLittleFriend(i, j))
                        this.array[i][j] = 2;
                }
            }
        }
    }



}
