package lecture10;

class employee{
    void calculateSalary(int s){
        System.out.println("Salary = "+s);
    }
}
class manager extends employee{
    void calculateSalary(int s){
        int b=s*25/100;
        System.out.println("Salary after bonus = "+(s+b));
    }
}
public class MOverriding3 {
    public static void main(String[] args){
        employee e1=new employee();
        e1.calculateSalary(1000);
        employee e2=new manager();
        e2.calculateSalary(1000);
    }
}
