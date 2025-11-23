package lecture3;

public class SplitFunc {
    public static void main(String[] args) {
        String s="hello java cpp";
        String a[]=s.split(" ");
        System.out.println("Strings are");
        for(String s1 : a){
            System.out.println(s1);
        }
    }
}
