package lecture2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter int value : ");
        int a=s.nextInt();
        System.out.println(a);
        System.out.print("Enter float value : ");
        float b=s.nextFloat();
        System.out.println(b);
        System.out.print("Enter string : ");
        String str=s.next();
        System.out.println(str);
    }
}
