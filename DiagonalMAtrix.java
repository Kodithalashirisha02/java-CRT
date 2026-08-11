/*WAPT find the sum of the elements present in the primary diagonal of given matrix*/
package Array2D;

import java.util.Scanner;

public class DiagonalMAtrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
	
		int arr[][]=new int[m][n];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
			System.out.println("Enter the values for"+i+","+j);
			arr[i][j]=sc.nextInt();
		}
	}
		int sum=0;

		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i][i];
			
			
		}
		System.out.println(sum);
	
	}
}
