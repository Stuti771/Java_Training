package lecture11;

interface Vehicle{
    default void start(){
        System.out.println("Vehicle is starting");
    }
}
class Car implements Vehicle{
}
public class Interface6 {
    public static void main(String[] args){
        Car c=new Car();
        c.start();
    }
}
