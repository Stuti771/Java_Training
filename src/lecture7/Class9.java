package lecture7;
class movie{
    String name;
    double rating;
    int ryear;
    void display(String name,double rating,int ryear){
        System.out.println("Name="+name);
        System.out.println("Rating="+rating);
        System.out.println("Release year="+ryear);
        System.out.println();
    }
}
public class Class9 {
    public static void main(String[] args){
        movie m1=new movie();
        m1.display("Pink",9.5,2021);
        movie m2=new movie();
        m2.display("Black",9.2,2022);
        movie m3=new movie();
        m3.display("Harry Potter",8.5,2023);
        movie m4=new movie();
        m4.display("Shutter Island",9.4,2024);
        movie m5=new movie();
        m5.display("Inception",9.0,2025);
    }

}
