package lecture6;

public class Methods {
    void intro(){         // non-static method
        System.out.print("Hello");
    }
    public static void main(String[] args){
        Methods in=new Methods();
        in.intro();
    }
}
