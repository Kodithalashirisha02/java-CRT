package arrays;

import java.util.Arrays;

public class LargestPrimeElement {
	public static int counteven(int arr[]) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		return count;
		
	}
	public static boolean primeElement(int num) {
		int count=1;
		for(int i=0;i<=num;i++) {
			if(num%2==0) {
				count++;
			}
	}
		return count==2;
	}
	public static int sumOfSmallest(int arr[]) {
		int sum=0;
		int smallesteven=Integer.MAX_VALUE;
		int smallestPrime=Integer.MAX_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				if(arr[i]%2==0 && primeElement(arr[j])&& arr[i]<smallesteven && arr[j]<smallestPrime) {
					smallesteven=arr[i];
					smallestPrime=arr[j];
					sum=sum+smallesteven+smallestPrime;
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,5,4,7,9,8};
		System.out.println(Arrays.toString(arr));
		int sum=sumOfSmallest(arr);
		System.out.println(sum);
		
	}


}
