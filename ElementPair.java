package arrays;
import java.util.Arrays;
public class ElementPair {
	public static void elementPair(int arr[]) {
		int value=12;
		for(int i=0;i<=arr.length-1;i++) {
			int prod=1;
			for(int j=i+1;j<=arr.length-1;j++) {
				prod=arr[i]*arr[j];
				if(prod==value) {
				System.out.println("The pairs of elements("+arr[i]+","+arr[j]+")");
			  }
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {2,4,1,5,3,7,4,6,12};
		System.out.println(Arrays.toString(arr));
		elementPair(arr);
	
	}                           
}
