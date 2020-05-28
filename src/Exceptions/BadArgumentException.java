package Exceptions;

import javax.swing.*;

public class BadArgumentException extends RuntimeException {
    public BadArgumentException(){

        JOptionPane.showMessageDialog(null, "Podano złe współrzędne ");
    }
}
