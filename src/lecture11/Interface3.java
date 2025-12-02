package lecture11;

interface a{
    void display();
}
interface b{
    void display();
}
class demo implements a,b{
    public void display(){
        System.out.println("Hello Demo");
    }
}
public class Interface3 {
    public static void main(String[] args) {
        demo d= new demo();
        d.display();
    }
}
