package lecture7;

class employee{
    String name;
    String id;
    int salary;
    void salary(){
        int i=salary*5/100;
        System.out.println("Employee Details:-");
        System.out.println("Name="+name);
        System.out.println("ID="+id);
        System.out.println("Salary before increment="+salary);
        System.out.println("Salary after increment="+(salary+i));
    }
}
public class Class8 {
    public static void main(String[] args){
        employee e=new employee();
        e.name="Radhika Apte";
        e.id="123abc";
        e.salary=50000;
        e.salary();
    }
}
