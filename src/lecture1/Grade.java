package lecture1;

public class Grade {
    public static void main(String[] args) {
        int a=54;
        int m=43;
        if(a>=75 && m>=75)
            System.out.print("Grade = A");
        else{
            if(a>=65 && m>=65)
                System.out.print("Grade = B");
            else
                System.out.print("Grade = C");
        }
    }
}
