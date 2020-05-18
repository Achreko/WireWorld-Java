public class Test1 {
    public static void main(String []args){
        Data d=new Data();
    d.addElement(new Element("test",2,3));
        d.addElement(new Element("test2",90,3));
        d.addElement(new Element("test2","option",0,3));
   for(int i=0;i<d.number_of_elements;i++){
       System.out.println(d.data[i]);

   }
    }

}
