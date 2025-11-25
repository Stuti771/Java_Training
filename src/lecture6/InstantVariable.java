package lecture6;

public class InstantVariable {
    int n=5;     //instant variable,cannot be accessed or called directly
    public static void main(String[] args){  //static variable can be accessed directly
        InstantVariable i=new InstantVariable();
        System.out.print(i.n);
    }
}
