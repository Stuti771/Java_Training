package lecture9;

public class MOverloading3 {
    void BookDetails(String title,String author){
        System.out.println("Book Details :-");
        System.out.println("Title = "+title);
        System.out.println("Author = "+author);
    }
    void BookDetails(String title,String author,int price){
        System.out.println("Book Details :-");
        System.out.println("Title = "+title);
        System.out.println("Author = "+author);
        System.out.println("Price = "+price);
    }
    public static void main(String[] args){
        MOverloading3 m=new MOverloading3();
        m.BookDetails("My Sister's Keeper","Jodi Picoult");
        System.out.println();
        m.BookDetails("My Sister's Keeper","Jodi Picoult",500);
    }
}
