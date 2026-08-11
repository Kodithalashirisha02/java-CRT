package arrays;
import java.util.Arrays;
public class sortingdescending {
	public static void main(String[] args) {
		int arr[]= {2,3,4,7,8,5,9};
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
