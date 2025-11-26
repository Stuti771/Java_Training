package lecture7;

class myClass{
    int a;
    myClass(int a){
        this.a=a; //this differentiate b/w instant variable and local variable.
        System.out.print(a);  //this is written before instant variable.
    }
}
public class This {
    public static void main(String[] args){
        myClass c=new myClass(5);
    }
}
