package arrays;
import java.util.Arrays;
public class PeakElement {
	public static void peakElement(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			if(i==0 && arr[i]>arr[i+1])
			{
				System.out.println(arr[i]);
			}
			else if(i==arr.length-1 && arr[i]>arr[i-1])
			{
				System.out.println(arr[i]);
			}
			else if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
				System.out.println(arr[i]);
			}
			
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,4,7,6,8,3,9};
		System.out.println(Arrays.toString(arr));
		peakElement(arr);
		
		
	}
}
