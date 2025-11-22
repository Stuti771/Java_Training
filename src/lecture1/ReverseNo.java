package lecture1;

public class ReverseNo {
    public static void main(String[] args) {
        int n=24617;
        System.out.println("No = "+n);
        int r=0,lg;
        while(n>0){
            lg=n%10;
            r=r*10+lg;
            n=n/10;
        }
        System.out.println("Reverse of above no = "+r);
    }
}
