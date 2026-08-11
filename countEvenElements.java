package arrays;

import java.util.Arrays;

public class countEvenElements {
	public static int largesteven(int arr[]) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0 && arr[i]>largest)
				largest=arr[i];
		}
		return largest;
	}
	public static int countEvenElements(int num) {
		int count=1;
		for(int i=0;i<=num;i++) {
			if(num%i==0)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[]= {2,1,0,3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr));
		int ele=largesteven(arr);
		System.out.println(ele);
		int counteven= countEvenElements(num);
		if(counteven>0) {
			System.out.println("largestelement");
		}
		else {
			System.out.println("cannot find largest even elemnet");
		}
		
	}

}
