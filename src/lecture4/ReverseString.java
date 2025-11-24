package lecture4;

public class ReverseString {
    public static void main(String[] args){
        String s="coding";
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
            rev+=s.charAt(i);
        System.out.println("String = "+s);
        System.out.println("Reversed string = "+rev);
    }

}
