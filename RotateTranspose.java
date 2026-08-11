package Array2D;

import java.util.Scanner;

public class RotateTranspose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size");
		int m=sc.nextInt();
		System.out.println("Enter the col size");
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the values for" +i+ "and"+j+":");
				arr[i][j]=sc.nextInt();
			}
		}
		UtilityClass.printMatrixMethod(arr);
		int brr[][]=new int[m][n];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				brr[i][j]=arr[j][i];
			}
		}
		System.out.println("Transpose matrix");
		UtilityClass.printMatrixMethod(brr);
		for(int i=brr.length-1;i>=0;i--) {
			for(int j=0;j<=brr[i].length-1;j++) {
				System.out.println("Transpose reverse");
				System.out.print(brr[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	}

}
