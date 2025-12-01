package lecture10;

class parent{
    static void eat(){
        System.out.println("pizza(parent)");
    }
    void data(){
        System.out.println("hello parent");
    }
    String name="parent";
}
class child extends parent {
    static void eat(){
        System.out.println("biryani(child)");
    }
    void data(){
        System.out.println("hello child");
    }
    String name="child";
}
public class MOverriding1 {
    public static void main(String[] args){
        parent c=new child();
        c.data();  // instant method override
        c.eat();   // static method does not override
        System.out.println(c.name);  // only methods override
    }
}