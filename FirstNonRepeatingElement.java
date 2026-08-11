package arrays;

import java.util.Arrays;

public class FirstNonRepeatingElement {
	public static int firstNonRepeating(int arr[]) {
		int duplicate=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=duplicate) {
				int count=1;
				for(int j=i+1;j<=arr.length-1;j++) {
					if(arr[i]==arr[j]) {
						count++;
						arr[j]=duplicate;
					}
				}
				if(count==1) {
					return arr[i];
				}
				
			}
			
		}
		return Integer.MIN_VALUE;
	
	}
	public static void main(String[] args) {
		int arr[]= {2,3,2,3,5,4,6};
		System.out.println(Arrays.toString(arr));
		int ele=firstNonRepeating(arr);
		System.out.println(ele);
		
	}

}
