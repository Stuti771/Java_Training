package lecture1;

public class PalindromeNo {
    public static void main(String[] args) {
        int n=123456;
        int original=n;
        int reverse=0;
        while(n>0){
            int ld=n%10;
            reverse=reverse*10+ld;
            n=n/10;
        }
        if(original==reverse)
            System.out.println("No is palindrome");
        else
            System.out.println("No is not palindrome");
    }
}
