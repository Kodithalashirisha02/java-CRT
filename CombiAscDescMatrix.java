/*WAP for below requirement
 * Given a N*N matrix.
 * sort the even row in ascending order.
 * sort odd row in descending order.
 */package Array2D;

import java.util.Scanner;

public class CombiAscDescMatrix {
	
		public static void ascOrder(int arr[]) {
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=i+1;j<=arr.length-1;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
		}
		public static void descOrder(int arr[]) {
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=i+1;j<=arr.length-1;j++) {
					if(arr[i]<arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
				
			}
		}
		public static  void printMatrix(int arr[][]) {
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr.length-1;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the row");
			int m=sc.nextInt();
			System.out.println("Enter the col size");
			int n=sc.nextInt();
			int arr[][]=new int[m][n];
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=0;j<=arr[i].length-1;j++) {
				System.out.print("Enter the values for"+i+"and"+j+":");
				arr[i][j]=sc.nextInt();
			}
			}
			printMatrix(arr);
			System.out.print("The sorted matrix:");
			for(int i=0;i<=arr.length-1;i++) {
				if(i%2==0) {
					descOrder(arr[i]);
				}
				else {
					ascOrder(arr[i]);
				}
			}
			printMatrix(arr);
			
		}
		
	}


