package arrays;

import java.util.Arrays;

public class EvenLargestArray {
	public static int largesteven(int arr[]) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0 && arr[i]>largest)
				largest=arr[i];
		}
		return largest;
	}
	public static void main(String[] args) {
		int arr[]= {2,1,0,3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		int ele=largesteven(arr);
		System.out.println(ele);
		
		
	}

}
