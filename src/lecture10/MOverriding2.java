package lecture10;

class vehicle{
    void startEngine(){}
}
class car extends vehicle{
    void startEngine(){
        System.out.println("Car engine started");
    }
}
public class MOverriding2 {
    public static void main(String[] args){
        vehicle c=new car();
        c.startEngine();
    }
}
