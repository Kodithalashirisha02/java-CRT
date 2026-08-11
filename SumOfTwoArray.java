package arrays;
import java.util.Arrays;
public class SumOfTwoArray {
	public static void sumOfArray(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
			   int sum=arr[i]+arr[j];
			   
				
			}
		}
	
	}
	public static void main(String[] args) {
		int arr[]= {321,123};
		System.out.println(Arrays.toString(arr));
		sumOfArray(arr);
		
		
	}

}
