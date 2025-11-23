package lecture2;

public class SumArray {
    public static void main(String[] args){
        int[] a={9,22,-13,-4,15};
        System.out.print("Array is : ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        int sum=0;
        for(int i=0;i<a.length;i++)
            sum+=a[i];
        System.out.print("Sum of elements of above array = "+sum);
    }
}
