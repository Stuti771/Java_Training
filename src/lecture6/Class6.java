package lecture6;

class circle{
    double r;
    void area(double r){
        System.out.println("Area="+(3.14*r*r));
    }
    void circumference(double r){
        System.out.println("Circumference="+(2*3.14*r));
    }
}
public class Class6 {
    public static void main(String[] args){
        circle c=new circle();
        c.area(3.33);
        c.circumference(3.33);
    }
}
