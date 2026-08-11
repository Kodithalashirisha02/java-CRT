package Array2D;

public class UtilityClass {
	
	public static void printMatrixMethod(int arr[][]) {
		System.out.println("given matrix");
		for(int i=0;i<=arr.length-1;i++) {
			for( int j=0;j<=arr[i].length-1;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	
	}

}
