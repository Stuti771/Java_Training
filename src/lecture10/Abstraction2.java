package lecture10;

abstract class animal{
    abstract void sound();
}
class dog extends animal{
    void sound(){
        System.out.println("Woof");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("Meow");
    }
}
public class Abstraction2 {
    public static void main(String[] args){
        animal s1=new dog();
        s1.sound();
        animal s2=new cat();
        s2.sound();
    }
}
