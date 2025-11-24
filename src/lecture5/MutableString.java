package lecture5;

public class MutableString {
    public static void main(String[] args){
        StringBuilder s=new StringBuilder("hello"); // mutable string
        s.append("j");
        System.out.println("String = "+s);
        s.insert(2,"hey");
        System.out.println("String = "+s);
    }
}
