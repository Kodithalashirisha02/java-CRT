package arrays;

import java.util.Arrays;

public class NonRepeatingElement {
	public static int nonRepeating (int arr[]) {
		int duplicate=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
			int count=1;
			if(arr[i]!=duplicate) {
				for(int j=0;j<=arr.length-1;j++) {
					if(arr[j]!=duplicate && arr[i]==arr[j]) {
						count++;
						arr[j]=duplicate;
					}
				}
			}
			if(count==1)
			{
				
				return arr[i];
			}
		}
		return Integer.MIN_VALUE;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,2,5,3,7,5,9};
		System.out.println(Arrays.toString(arr));
		int ele=nonRepeating(arr);
		System.out.println(ele);
	}

}
