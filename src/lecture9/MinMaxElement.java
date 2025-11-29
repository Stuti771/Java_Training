package lecture9;

import java.util.Scanner;

public class MinMaxElement {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int r=s.nextInt();
        System.out.print("Enter no of columns : ");
        int c=s.nextInt();
        int[][] a=new int[r][c];
        System.out.print("Enter "+(r*c)+" elements : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                a[i][j]=s.nextInt();
        }
        System.out.println("Array is : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
        int max=a[0][0];
        int min=a[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++) {
                if(a[i][j]>max)
                   max=a[i][j];
                if(a[i][j]<min)
                   min=a[i][j];
            }
        }
        System.out.println("Maximum element in above array : "+max);
        System.out.println("Minimum element in above array : "+min);
    }
}
