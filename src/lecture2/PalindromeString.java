package lecture2;

public class PalindromeString {
    public static void main(String[] args) {
        String s="abcdcbaa";
        int i,j=s.length()-1;
        for(i=0;i<s.length()/2;i++) {
            if (s.charAt(i) != s.charAt(j))
                break;
            j--;
        }
        if(i<s.length()/2)
            System.out.print("String is not palindrome");
        else
            System.out.print("String is palindrome");
    }
}
