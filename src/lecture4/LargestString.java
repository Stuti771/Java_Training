package lecture4;

public class LargestString {
    public static void main(String[] args) {
        String s = "Java Is Powerfull";
        String a[] = s.split(" ");
        String largest="";
        for (String s1 : a) {
            if(s1.length()>largest.length())
                largest=s1;
        }
        System.out.print("Largest string="+largest);
    }
}
