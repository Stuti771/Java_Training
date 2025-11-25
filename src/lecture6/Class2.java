package lecture6;

class Student {
    String name;
    int rollNo;
    int marks;

    void display(String name, int rollNo, int marks) {
        System.out.println("Name=" + name);
        System.out.println("Roll No=" + rollNo);
        System.out.println("Marks=" + marks);
        System.out.println();
    }
}
public class Class2 {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.display("Akshay",33,67);
        s1.display("Bianca",43,78);
        s1.display("Rumi",60,90);
    }
}
