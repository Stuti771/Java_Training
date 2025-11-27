package lecture8;

// Single-level Inheritance

class shape{
    void draw(){
        System.out.println("Circle is drawn");
    }
}
class circle extends shape{
    void area(){
        System.out.println("Area of circle is calculated");
    }
}
public class Inheritance3 {
    public static void main(String[] args){
        circle c=new circle();
        c.draw();
        c.area();
    }
}
