/*WAP transpose of given matrix 
 * 1 2 3 
 * 4 5 6 
 * 7 8 9
 * 
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * 
 * 
 * */
 package Array2D;



public class TransposeOfMatrix {
	public static void main(String[] args) {
		int arr[][]={
				  {0,1,2},
				  {1 ,2,3},
				  {4,5,6}
				 };
		UtilityClass.printMatrixMethod(arr);
	
				  
		int brr[][]=new int[arr[0].length][arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				brr[j][i]=arr[i][j];
			}
		}

		UtilityClass.printMatrixMethod(brr);
		
		
		
	}

		

}




