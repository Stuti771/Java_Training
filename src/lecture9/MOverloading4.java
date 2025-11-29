package lecture9;

public class MOverloading4 {
    void display(int[] a){
        System.out.print("1D array is : ");
        for(int i:a)
            System.out.print(i+" ");
        System.out.println();
    }
    void display(String[] a){
        System.out.print("Char array is : ");
        for(String s:a)
            System.out.print(s+" ");
        System.out.println();
    }
    void display(int[][] a){
        System.out.println("2D array is : ");
        for(int[] row:a){     // access a row
            for(int num:row)    // access a no
                System.out.print(num+" ");
            System.out.println();
        }
    }
    public static void main(String[] args){
        MOverloading4 m=new MOverloading4();
        int[] a={1,2,3,4,5};
        m.display(a);
        int[][] b={{1,2,3},{4,5,6}};
        m.display(b);
        String[] c={"flips","slip","lips"};
        m.display(c);
    }
}
