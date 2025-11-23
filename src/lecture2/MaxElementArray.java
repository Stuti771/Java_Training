package lecture2;

public class MaxElementArray {
    public static void main(String[] args){
        int[] a={9,223,-13,-4,125};
        System.out.print("Array is : ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        int max=a[0];
        for(int i=1;i<a.length;i++)
            if(max<a[i])
                max=a[i];
        System.out.println("Maximum element in above array = "+max);
    }
}
