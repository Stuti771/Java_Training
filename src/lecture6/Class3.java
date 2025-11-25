package lecture6;

class rectangle{
    double l,b;
    void area(double l,double b){
        System.out.println("Area = "+(l*b));
    }
    void perimeter(double l,double b) {
        System.out.println("Perimeter = "+(2*(l+b)));
    }
}
public class Class3 {
    public static void main(String[] args){
        rectangle r1=new rectangle();
        r1.perimeter(5.6,8.9);
        r1.area(4.54,7.8);
    }
}
