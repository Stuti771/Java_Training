package lecture1;

public class Sum1toN {
    public static void main(String[] args){
        int n=10;
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.print("Sum of first "+n+" natural no = "+sum);
    }
}
