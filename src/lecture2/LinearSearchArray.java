package lecture2;

public class LinearSearchArray {
    public static void main(String[] args){
        int[] a={1,2,90,34,5,23,13,22,10,29};
        System.out.print("Array is : ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
        int i,target=23;
        System.out.println("Target : "+target);
        for(i=0;i<a.length;i++)
            if(a[i]==target)
                break;
        if(i<a.length)
           System.out.println("Element found");
        else
           System.out.println("Element not found");
    }
}
