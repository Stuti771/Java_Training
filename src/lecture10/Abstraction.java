package lecture10;

abstract class p{
    abstract void eat();
}
class c extends p{
    void eat(){
        System.out.println("Meat");
    }
}
public class Abstraction {
    public static void main(String[] args){
        c c1=new c();
        c1.eat();

    }
}
