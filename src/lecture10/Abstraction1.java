package lecture10;

abstract class shape{
    abstract void area();
}
class circle extends shape{
    void area(){
        System.out.println("Circle");
    }
}
class rectangle extends shape{
    void area(){
        System.out.println("Rectangle");
    }
}
public class Abstraction1 {
    public static void main(String[] args){
        shape s1=new circle();
        s1.area();
        shape s2=new rectangle();
        s2.area();
    }
}
