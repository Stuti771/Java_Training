package lecture11;

interface A{
    void a();
}
interface B{
    void b();
}
class C implements A,B{
    public void a(){
        System.out.println("A");
    }
    public void b(){
        System.out.println("B");
    }
}
public class Interface1 {
    public static void main(String[] args){
        C c=new C();
        c.a();
        c.b();
    }
}
