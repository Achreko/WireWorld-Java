import Data.*;
import Exceptions.BadArgumentException;
import Exceptions.BadDiodeModifierException;
import Exceptions.BadElementException;
import Loader.*;
import Objects.Getter;

import java.io.IOException;

public class Test1 {
    public static void main(String []args) {

        String k = "/Users/kasia/desktop/plik.txt";
        try {
            Data data = new Data();
            data=Load.readData(k);
            int[][] w =new int[50][50];
            w = Create_Board.check_and_load(data);
            for(int i=0;i<data.getNumber_of_elements();i++) {
                System.out.println(data.data[i]);
            }
            System.out.println(data.getNumber_of_elements());

            for (int i = 0; i < Getter.get_rows(); i++) {
                for (int j=0;j<Getter.get_columns();j++){
                    System.out.print(w[i][j]);
                }
                System.out.print('\n');
            }
        } catch (BadArgumentException e) {
            System.out.println(e.getMessage());

        }catch (IOException i) {
            System.out.println(i.getMessage());
        }catch(BadDiodeModifierException b){
            System.out.println(b.getMessage());
        }catch (BadElementException g){
            System.out.println(g.getMessage());
        }


    }

}
