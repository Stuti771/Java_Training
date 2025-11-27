package lecture8;

// Single-level Inheritance

class employee{
    void work(){
        System.out.println("Employee is working");
    }
}
class manager extends employee{
    void meeting(){
        System.out.println("Manager is attending a meeting");
    }
}
public class Inheritance1 {
    public static void main(String[] args){
        manager m=new manager();
        m.meeting();
        m.work();
    }
}
