package lecture7;

class Intro{
    Intro(String s){
        System.out.println(s);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args){
        Intro i1=new Intro("Hello");
        Intro i2=new Intro("Hey");
        Intro i3=new Intro("Hi");
    }

}
