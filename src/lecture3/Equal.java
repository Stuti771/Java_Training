package lecture3;

public class Equal {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println("String 1="+s1);
        System.out.println("String 2="+s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println();
        s1=new String ("hello");
        s2=new String ("hello");
        System.out.println("String 1="+s1);
        System.out.println("String 2="+s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
