package lecture5;

public class Palindrome {
    public static void main(String[] args){
        String s1="malayalam";
        System.out.println("String = "+s1);
        String s2="";
        for(int i=s1.length()-1;i>=0;i--)
            s2+=s1.charAt(i);
        System.out.println("Reversed string = "+s2);
        if(s1.equals(s2) ){
            System.out.println("String is palindrome");}
        else{
            System.out.println("String is not palindrome");}
    }
}
