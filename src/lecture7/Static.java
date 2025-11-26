package lecture7;

class car{
    String s="hello";  // non-static
    static void display(){  //static, doesn't need an object to be called
        car c=new car();
        System.out.print(c.s);
    }
}
public class Static {
    public static void main(String[] args){
        car.display();
    }
}
