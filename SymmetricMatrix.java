/*A matrix is called as symmetric matrix is given matrix is equal to its transpose
 * 1 2 3 
 * 2 4 5
 * 3 5 6
 * 
 * 1 2 3
 * 2 4 5
 * 3 5 6
 * */
package Array2D;

import java.util.Scanner;

public class SymmetricMatrix {
	public static boolean checkSymmetric(int arr[][]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				if(arr[i][j]!=arr[j][i]) {
					return false;
				}
				
			}
			
		}
		
		return true;	
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
			String result=checkSymmetric(arr)?"Symmetric Matrix":"Not an Symmetric matrix";
			System.out.println(result);
			

		}

	}

		
	





