package lecture2;

public class ReverseArray {
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7};
        int l=a.length;
        System.out.print("Array : ");
        for(int i=0;i<l;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        System.out.print("Reversed array : ");
        for(int i=l-1;i>=0;i--)
           System.out.print(a[i]+" ");
    }
}
