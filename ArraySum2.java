package Array2D;
import java.util.Scanner;
public class ArraySum2 {
		public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter m value");
			int m=sc.nextInt();
			System.out.println("Enter n value");
			int n=sc.nextInt();
			int sum=0;
			int arr[][]=new int[m][n];
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Enter the values for"+i+","+j);
				arr[i][j]=sc.nextInt();
			}
		}
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr[i].length-1;j++) {
					sum=sum+arr[i][j];
					
				}
				System.out.println();
			}
			System.out.print(sum);
		
		}
		
}
