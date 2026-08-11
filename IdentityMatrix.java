/*WAPT check whether given matrix is an identity matrix or not
 * identity matrix is a type of square matrix whose principle diagonal elements are 1 and all the other element are zero
 * 1 0 0
 * 0 1 0
 * 0 0 1
 * */
 
 package Array2D;

import java.util.Scanner;

public class IdentityMatrix {
	public static boolean checkIdentity(int arr[][]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				int num=1;
				num++;
				if(arr[i][i]!=num)
					return false;
				else if(i!=j && arr[i][j]!=0)
					return false;
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
			String result=checkIdentity(arr)?"Identity Matrix":"Not an identity matrix";
			System.out.println(result);
			

		}

	}

		
	


