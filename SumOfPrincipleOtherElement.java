/*WAPT check whether the sum of the principle diagonal element is equal to the other element */
package Array2D;
import java.util.Scanner;
public class SumOfPrincipleOtherElement {
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
		int sumpr=0;
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				if(arr[i]==arr[j]) {
					sumpr=sumpr+arr[i][i];
					
						
				}
				else {
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println(sumpr);
		System.out.println(sum);
		

	}

}
