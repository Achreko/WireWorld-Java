import javax.swing.*;

public class DialogBox {
    public static String g;  //liczba generacji, na razie tylko w formacie String
    public DialogBox(Frame obj){
        g= JOptionPane.showInputDialog(obj,"Podaj ile generacji chcesz wykonać");

    }
}
