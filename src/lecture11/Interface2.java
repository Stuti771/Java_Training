package lecture11;

interface Walkable{
    void walk();
}
interface Runnable{
    void run();
}
class Human implements Walkable,Runnable{
    public void walk(){
        System.out.println("He walks");
    }
    public void run(){
        System.out.println("She runs");
    }
}
public class Interface2 {
    public static void main(String[] args){
        Human h=new Human();
        h.walk();
        h.run();
    }
}
