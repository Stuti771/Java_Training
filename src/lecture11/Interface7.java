package lecture11;

interface Aa{
    private void helper(){
        System.out.println("Helper is here");
    }
    default void show(){
        helper();
        //private methods are not accessible in implementing classes or outside the interface
        System.out.println("Helper is helping");
    }
}
class Bb implements Aa{}
public class Interface7 {
    public static void main(String[] args){
        new Bb().show();
    }
}
