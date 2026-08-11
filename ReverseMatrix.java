/*WAPT reverse each row present in the given matrix
 * 1 2 3 
 * 4 5 6
 * 7 8 9 
 * 
 * reverse
 * 
 * 3 2 1 
 * 6 5 4 
 * 9 8 7*/
package Array2D;

import java.util.Scanner;

public class ReverseMatrix {
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
		
		int brr[][]=new int [m][n];
		for(int i=0;i<=arr.length-1;i++) {
			//int index=0;
			int index=arr[i].length-1;
			//for(int j=arr[i].length-1;j>=0;j--) {
			for(int j=0;j<=arr[i].length-1;j++) {
		//	brr[i][index++]=arr[i][j];
				brr[i][index--]=arr[i][j];
				
			}
		}
		UtilityClass.printMatrixMethod(brr);
		
		
		
	}

}


