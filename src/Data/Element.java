package Data;

//przechowywanie kazdego elemementu(dioda,elektron itp) ktory poda uzytkownik w pliku
public class Element {
    public String name;
    public String option;
    public int x;
    public int y;

    public Element(String name,int x,int y){
        this.x=x;
        this.y=y;
        this.name=name;
    }

    public Element(String name, String option,int x,int y){
        this.name=name;
        this.option=option;
        this.x=x;
        this.y=y;
    }


    @Override
    public String toString() {
        if(option!=null) {
            StringBuilder b = new StringBuilder(name + " " + x + " " + y + " " + option);
            return b.toString();
        }else{
            StringBuilder b = new StringBuilder(name + " " + x + " " + y );
            return b.toString();
        }

    }
}
