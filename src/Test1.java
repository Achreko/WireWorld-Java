import Data.*;
import Loader.*;

import java.io.IOException;

public class Test1 {
    public static void main(String []args) {

        /*
    d.addElement(new Element("test",2,3));
        d.addElement(new Element("test2",90,3));
        d.addElement(new Element("test2","option",0,3));
   for(int i=0;i<d.number_of_elements;i++){
       System.out.println(d.data[i]);

   }
   */
        String k = "/Users/kasia/desktop/plik.txt";
        try {
            Data data = new Data();
            data=Load.readData(k);
            for(int i=0;i<data.getNumber_of_elements();i++) {
                System.out.println(data.data[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }

}
