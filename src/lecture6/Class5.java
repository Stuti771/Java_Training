package lecture6;

class car{
    String b;
    String m;
    int p;
    void display(String b,String m,int p){
        System.out.println("Car Details:-");
        System.out.println("Brand="+b+"\n"+"Model="+m+"\n"+"Price="+p);
    }
}
public class Class5 {
    public static void main(String[] args){
        car c1=new car();
        c1.display("Audi","M4",80000);
        System.out.println();
        car c2=new car();
        c2.display("BMW","B6",75000);
    }
}
