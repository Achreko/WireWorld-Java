import javax.swing.*;

public class Frame extends JFrame{
//konstruktor
    private Frame(){
        super("Wire World");
        setSize(400,200);
        setResizable(true);
        setLocationRelativeTo(null); //sprawi ze okno okienko pojawi sie na srodku
        setVisible(true);//trzeba ustawic na true, inaczej nie bedzie widac okienka
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTextField textfield=new JTextField();
    }

    public static void myMainFrame(){
        Frame frame=new Frame();
        DialogBox box=new DialogBox(frame);
    }


}
