package lecture9;

public class MethodOverloading {
    void sum(){
        System.out.println("hello");
    }
    void sum(int a){
        System.out.println(a);
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        MethodOverloading m=new MethodOverloading();
        m.sum(3,6);
    }
}
