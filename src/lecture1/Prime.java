package lecture1;

public class Prime {
    public static void main(String[] args) {
        int n=17;
        System.out.println("No = "+n);
        int count=0;
        int i=2;
        while(i<n/2){
            if(n%i==0) {
                count++;
                break;
            }
            i++;
        }
        if(count==0)
           System.out.println("The above no is prime");
        else
           System.out.println("The above no is not prime");
    }
}
