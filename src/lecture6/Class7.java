package lecture6;

class book{
    String title;
    String author;
    int price;
    void discount(String title,String author,int price){
        int d=price*10/100;
        System.out.println("Book Details:-");
        System.out.println("Title="+title);
        System.out.println("Author="+author);
        System.out.println("Price="+price);
        System.out.println("Final price(after discount)="+(price-d));
    }
}
public class Class7 {
    public static void main(String[] args){
        book b=new book();
        b.discount("Prey","Michael Chrichton",500);
    }
}
