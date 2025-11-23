package lecture2;

public class CountEvenOddArray {
    public static void main(String[] args){
        int[] a={19,22,-13,-14,5};
        System.out.print("Array is : ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        int ceven=0,codd=0;
        for(int i=0;i<a.length;i++)
            if(a[i]%2==0)
               ceven++;
            else
               codd++;
        System.out.println("Even elements in above array = "+ceven);
        System.out.println("Odd elements in above array = "+codd);
    }
}
