package lecture8;

// Multi-level Inheritance

class person{
    void displayName(){
        System.out.println("Name = abc");
    }
}
class student extends person{
    void displayClass(){
        System.out.println("Class = 5th");
    }
}
class monitor extends student{
    void checkDiscipline(){
        System.out.println("Discipline is maintained");
    }
}
public class Inheritance2 {
    public static void main(String[] args){
        monitor m=new monitor();
        m.displayName();
        m.displayClass();
        m.checkDiscipline();
    }
}
