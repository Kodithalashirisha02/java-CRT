package Array2D;
import java.util.Scanner;
public class MaxPrimeElementMatrix {
	public static void printMatrix(int arr[][]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean checkPrime(int ele) {
		int count=0;
		for(int i=1;i<=ele;i++) {
			if(ele%i==0)
				count++;
		}
		return count==2;
	}
	public static void main(String args[]) {
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
		int max=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++) {
				if(checkPrime(arr[i][j])) {
					if(max<arr[i][j])
					max=arr[i][j];
				}
					
			}
		}
		System.out.println("Maximum Element is:"+max);
	}
	}
		

