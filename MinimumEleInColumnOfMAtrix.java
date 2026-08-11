package Array2D;
import java.util.Scanner;
public class MinimumEleInColumnOfMAtrix {
	public static void printMatrix(int arr[][])
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
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
	printMatrix(arr);
	for(int i=0;i<=arr.length-1;i++)
	{
		int min=Integer.MAX_VALUE;
		for(int j=0;j<=arr[i].length-1;j++) {
			if(min>arr[j][i])
				min=arr[j][i];
		}
		System.out.println("Maximum Element is:"+min);
	}
}
}


