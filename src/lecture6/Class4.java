package lecture6;

class BankAccount{
    int accNo;
    String accHol;
    int b=1000;
    int am;
    void deposit(int accNo,String accHol,int am){
        System.out.println("Deposit Successful");
        System.out.println("Current balance = "+(b+am));
    }
    void withdraw(int accNo,String accHol,int am){
        if(b>=am) {
            System.out.println("Withdraw Successful");
            System.out.println("Current balance = " +(b-am));
        }
        else {
            System.out.println("Withdraw Unsuccessful");
            System.out.println("Insufficient Balance");
        }
    }
}
public class Class4 {
    public static void main(String[] args){
        BankAccount b=new BankAccount();
        b.deposit(345,"adc",500);
        System.out.println();
        b.withdraw(678,"jkl",10000);
    }
}
