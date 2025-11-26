package lecture7;

class calculator{
    int a;
    int b;
     void add(int a,int b){
         System.out.println("Addition="+(a+b));
     }
    void sub(int a,int b){
        System.out.println("Subtraction="+(a-b));
    }
    void mul(int a,int b){
        System.out.println("Product="+(a*b));
    }
    void div(int a,int b){
        System.out.println("Division="+(a/b));
    }
}
public class Class10 {
    public static void main(String[] args){
        calculator c=new calculator();
        c.add(10,5);
        c.sub(5,2);
        c.mul(9,5);
        c.div(15,3);
    }
}
