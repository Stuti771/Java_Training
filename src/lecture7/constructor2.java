package lecture7;

class laptop{
    String brand;
    int ram;
    int price;
    laptop(String brand,int ram,int price) {
         this.brand=brand;
         this.ram=ram;
         this.price=price;
    }
    void display(){
         System.out.println("Brand="+brand);
         System.out.println("RAM="+ram);
         System.out.println("Price="+price);
    }
}
public class constructor2 {
    public static void main(String[] args){
        laptop l=new laptop("ASUS",512,60000);
        l.display();
    }
}
