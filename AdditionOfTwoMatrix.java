/*WAPT find the addition of two matrix
 * arr-->1 2 3             brr--> 1 2 1
 *       3 4 1    --->            2 3 1
 *       2 3 4                    4 1 3
 *       
 *       crr-->
 *       2 4 4
 *       5 7 2
 *       6 4 7
 * 
 */
package Array2D;

import java.util.Scanner;

public class AdditionOfTwoMatrix {
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
			System.out.println("Enter the values for" +i+ "and"+j+":");
			arr[i][j]=sc.nextInt();
		}
	}
	UtilityClass.printMatrixMethod(arr);
	int crr[][]=new int[arr.length][arr[0].length];
	for(int i=0;i<=arr.length-1;i++) {
		for(int j=0;j<=arr[i].length-1;j++) {
			crr[i][j]=arr[i][j]+brr[i][j];
		}
		
		
		
	}
	
	UtilityClass.printMatrixMethod(crr);
	
	}	

}



/*To perform addition of two matrix the no of rows and no of columns of both the matrices should be same*/
