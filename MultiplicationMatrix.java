/*If A and B are 2 matrix then ,(a*b)
 * no of col's of a matrix=no of rows of b matrix
 *(m*n)=(n*p)
 *
 *res=m*p
 *
 *2)  (b*a)
 *no of cols of a matrix =no of b matrix
 *(b*a) 
 *(x*y)(y*z)
 *result matrix:(x*z)
 *
 *ex:
 *      1 2        3 1        7   5
 *      3 4        1 1---->   17 11 
 *      
 *      3 1        1 2        9    10 
 *      1 1        3 4---->   4     6
 *      
 *      1 2 3     1 3         [(1*1)+(2*2)+(3*1)    (1*3)+(2*2)+(3*3)       8 16
 *      3 4 2     2 2---->     (3*1)+(4*2)+(2*1)    (3*3)+(4*2)+(2*3)]--->  13 23
 *                1 3
 *                
 *       1 3       1 2 3      [(1*1)+(3*3)  (1*2)+(3*4)   (1*3)+(3*2)      10 14 9
 *       2 2       3 4 2---->  (2*1)+(2*3)  (2*2)+(2*4)   (2*3)+(2*2)       8 12 10
 *       1 3                   (1*1)+(3*3)  (1*2)+(3*4)   (1*3)+(3*2)]-->   10 14 9
 *                
 *        
 */
 package Array2D;

import java.util.Scanner;

public class MultiplicationMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size");
		int m=sc.nextInt();
		System.out.println("Enter the col size");
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.println("Enter the values for" +i+ "and"+j+":");
				a[i][j]=sc.nextInt();
			}
		}
		UtilityClass.printMatrixMethod(a);
		int b[][]=new int[m][n];
		for(int i=0;i<=b.length-1;i++) {
			for(int j=0;j<=b[i].length-1;j++) {
				System.out.println("Enter the values for" +i+ "and"+j+":");
				b[i][j]=sc.nextInt();
			}
		}
		UtilityClass.printMatrixMethod(b);
		int r1=a.length;
		 int r2=b.length;
	    int c1=a[0].length;
		int c2=b[0].length;
		int c[][]=new int[m][n];
		for(int i=0;i<=c.length-1;i++) {
			for(int j=0;j<=c.length-1;j++) {
				for(int k=0;k<=c.length-1;k++) {
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		
		UtilityClass.printMatrixMethod(c);
		
	}

}
