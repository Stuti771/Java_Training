package lecture9;

public class MOverloading1 {
    void sum(int a,int b){
        System.out.println("Sum="+(a+b));
    }
    void sum(int a,int b,int c){
        System.out.println("Sum="+(a+b+c));
    }
    void sum(double a,double b){
        System.out.println("Sum="+(a+b));
    }
    public static void main(String[] args){
        MOverloading1 m=new MOverloading1();
        m.sum(3,5);
        m.sum(2,5,8);
        m.sum(4.56,7.89);
    }
}
