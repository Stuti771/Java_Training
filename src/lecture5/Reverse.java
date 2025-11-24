package lecture5;

public class Reverse {
    public static void main(String[] args) {
        String s="i love java";
        String a[]=s.split(" ");
        StringBuilder result=new StringBuilder();
        for(String b : a){
            StringBuilder val=new StringBuilder(b);
            result.append(val.reverse().append(" "));
        }
        System.out.println("String = "+s);
        System.out.println("Reversed string = "+result);
    }
}
