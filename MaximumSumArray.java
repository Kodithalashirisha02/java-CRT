package arrays;

import java.util.Arrays;

public class MaximumSumArray {
	public static void maxElementPair(int arr[]) {
		int ele1=0;
		int maxsum=0;
		int ele2=0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				int sum=arr[i]+arr[j];
				if(sum>maxsum) {
					maxsum=sum;
					ele1=arr[i];
					ele2=arr[j];
				}
			}
		}
		System.out.println("maxsum="+maxsum);
		System.out.println("The pairs are:("+ele1+","+ele2+")");
	}
	public static void main(String[] args) {
		int arr[]= {2,4,1,7,4,6,12};
		System.out.println(Arrays.toString(arr));
		maxElementPair(arr);
		
	}

}
