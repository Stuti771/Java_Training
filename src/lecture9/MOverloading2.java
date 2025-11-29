package lecture9;

public class MOverloading2 {
    void area(double r){
        System.out.println("Area of circle = "+(3.14*r*r));
    }
    void area(double l,double b){
        System.out.println("Area of rectangle = "+(l*b));
    }
    void area(int a){
        System.out.println("Area of square = "+(a*a));
    }
    void area(int b,int h){
        System.out.println("Area of triangle = "+(0.5*b*h));
    }
    public static void main(String[] args){
        MOverloading2 m=new MOverloading2();
        m.area(2.2);
        m.area(2.3,5.6);
        m.area(2);
        m.area(5,6);
    }
}
