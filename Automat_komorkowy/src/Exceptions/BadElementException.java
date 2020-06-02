package Exceptions;

import javax.swing.*;

public class BadElementException extends RuntimeException {
    public BadElementException(String message){

        //super(message);
        JOptionPane.showMessageDialog(null, "Złe dane wejściowe, podany elemement z pliku nie istnieje");
    }
}
