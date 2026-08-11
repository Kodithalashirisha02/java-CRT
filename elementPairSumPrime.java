package arrays;

import java.util.Arrays;

public class elementPairSumPrime {
	public static boolean checkPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count==2;
	}
	public static int[] sumOfElement(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				int sum=arr[i]+arr[j];
				if(checkPrime(sum)) {
				System.out.println(" The pairs of elements("+arr[i]+","+arr[j]+")");
					
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {2,4,1,5,3,7,4,6,12};
		System.out.println(Arrays.toString(arr));
		sumOfElement(arr); 
		
	
	}

}
