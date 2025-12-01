package lecture10;

abstract class payment{
    abstract void pay(int a);
    void success(){
        System.out.println("Payment Done");
    }
}
class upi extends payment{
    void pay(int a){
        System.out.println("Pay via UPI -> "+a);
    }
}
class netBanking extends payment{
    void pay(int b){
        System.out.println("Pay via NetBanking -> "+b);
    }
}
public class Abstraction3 {
    public static void main(String[] args){
        payment o1=new upi();
        o1.pay(500);
        o1.success();
        System.out.println();
        payment o2=new netBanking();
        o2.pay(1000);
        o2.success();
    }
}
