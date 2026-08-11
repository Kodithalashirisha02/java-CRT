/*
 * WAPT check whether the given matrix is Psarse matrix
 * Sparse matrix is a type of square matrix in which the no of zero elements are more than non zero elements
 *  1 2 0 
 *  0 2 0
 *  0 4 0
 * */
package Array2D;

import java.util.Scanner;

public class SparseMatrix {
	public static void checkSparse(int arr[][]) {
		int count=0;
		int countev=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				
				if(arr[i][j]==0)
					count++;
				else
					countev++;
			}
		}
		if (count>countev) {
			System.out.println("Sparse matrix");
		}
		else
		{
			System.out.println("Not a sparse matrix");
		}
														
	}
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
			checkSparse(arr);
		}

	}

		
	




/*WAPT check whether given matrix are symmetric matrix matrix or not*/
