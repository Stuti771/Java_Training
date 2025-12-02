package lecture11;

interface Shape{
    double area();
}
class Circle implements Shape{
    private double r;
    Circle(double r){
        this.r=r;
    }
    public double area(){
        return 3.14*r*r;
    }
}
public class Interface5 {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        System.out.println("Area of circle = "+c.area());
    }
}
