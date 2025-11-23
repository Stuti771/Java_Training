package lecture2;

public class PositiveNegative {
    public static void main(String[] args) {
        int n=-45;
        if(n>0)
            System.out.print("No is positive");
        else{
            if(n<0)
                System.out.print("No is negative");
            else
                System.out.print("Not defined");
        }
    }
}
