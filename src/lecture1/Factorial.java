package lecture1;

public class Factorial {
    public static void main(String[] args) {
        int n=10;
        int fac=1;
        for(int i=1;i<=n;i++)
            fac*=i;
        System.out.println("No = "+n);
        System.out.println("Factorial of above no = "+fac);
    }
}
