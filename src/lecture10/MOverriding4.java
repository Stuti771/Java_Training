package lecture10;

class person{
    void display(){
        String n="Abcdef";
        int a=20;
        System.out.println("Name = "+n);
        System.out.println("Age = "+a);
    }
}
class student extends person{
    void display(){
        String g="A";
        String schoolName="abc";
        System.out.println("School name = "+schoolName);
        System.out.println("Grade = "+g);
    }
}
public class MOverriding4 {
    public static void main(String[] args){
       // person p=new person();
       // p.display();
        person s=new student();
        s.display();
    }
}
