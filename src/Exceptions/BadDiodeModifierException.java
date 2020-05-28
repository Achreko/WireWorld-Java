package Exceptions;

import javax.swing.*;

public class BadDiodeModifierException extends RuntimeException{

        public BadDiodeModifierException(String message){

            JOptionPane.showMessageDialog(null, "Błędnie podano modyfikator diody");;
        }
}
