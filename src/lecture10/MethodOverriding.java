package lecture10;

class Animal{
    void eat(){
        System.out.println("pizza");
    }
}
class Dog extends Animal {
    void eat(){
        System.out.println("biryani");
    }
    void data(){
        System.out.println("hello");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        Dog d=new Dog();
        d.eat();
        d.data();
        System.out.println();
        Animal d1=new Dog();  //reference parent (upper casting)
        d1.eat();             // only reference class methods can be accessed by upper casting
        System.out.println();
        Dog d2=(Dog)d;  // (down casting)
        d2.data();      // methods present in only child can be accessed by down casting
    }
}
