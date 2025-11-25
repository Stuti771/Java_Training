package lecture6;

class Car{
    String name="BMW";
    void display(){
        System.out.print(name);
    }
}
public class Class1 {
    public static void main(String[] args){
        Car c=new Car();
        c.display();
    }
}
