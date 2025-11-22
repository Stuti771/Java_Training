package lecture1;

public class Divisible {
    public static void main(String[] args) {
        int n=50;
        System.out.println("No : "+n);
        if(n%5==0&&n%11==0)
            System.out.println("No is divisible by 5 and 11");
        else
            System.out.println("No is not divisible by 5 and 11");
    }
}
