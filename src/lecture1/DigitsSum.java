package lecture1;

public class DigitsSum {
    public static void main(String[] args) {
       int n=12345;
       int sum=0;
       while(n!=0) {
           int ld=n%10;
           sum+=ld;
           n=n/10;
       }
       System.out.println(sum);
    }
}
