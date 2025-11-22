package lecture1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first no : ");
        int a=s.nextInt();
        System.out.print("Enter second no : ");
        int b=s.nextInt();
        System.out.print("Enter operator : ");
        char op=s.next().charAt(0);
        switch(op){
            case '+' : System.out.println("Addition = "+(a+b));
                       break;
            case '-' : System.out.println("Subtraction = "+(a-b));
                       break;
            case '*' : System.out.println("Product = "+(a*b));
                       break;
            case '/' : float c=(float)a/b;
                       System.out.println("Division = "+c);
                       break;
            default : System.out.println("Invalid Operator");
        }
    }
}
