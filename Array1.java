package Array2D;

import java.util.Scanner;

public class Array1 {
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
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	
	
	
	}
}
/*array_ref[index].length--->row length
 * array_ref.length---->total no of row
*/



/*WAP sum of the elements present in the given matrix*/



