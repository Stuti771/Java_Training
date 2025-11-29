package lecture9;

import java.util.Scanner;

public class ColumnWiseSum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int r=s.nextInt();
        System.out.println("Enter no of columns : ");
        int c=s.nextInt();
        int[][] a=new int[r][c];
        System.out.println("Enter "+(r*c)+" elements : ");
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
        for(int i=0;i<c;i++){
            int sum=0;
            for(int j=0;j<r;j++)
                sum+=a[j][i];
            System.out.println("Sum of column "+(i+1)+" = "+sum);
        }
    }
}
