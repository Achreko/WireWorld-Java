//lista elementow do generacji
public class Data {
    public Element[] data =new Element[10];
    public int number_of_elements=0;


    private void resize(){
        Element[] n=new Element[2*number_of_elements];
        System.arraycopy(data,0,n,0, data.length);
        data=n;
    }

    public void addElement(Element e){
        if(number_of_elements == data.length) resize();
        data[number_of_elements++]=e;
    }

}




