package arrays;

import java.util.Arrays;

public class PrimeElementOdd {
	public static boolean checkPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		return count==2;
	}
	public static void primePairSum(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			if(checkPrime(arr[i])) {
				for(int j=0;j<=arr.length-1;j++) {
					if(checkPrime(arr[j])) {
						int sum=arr[i]+arr[j];
						if(sum%2!=0) {
							System.out.println("The pairs elements are ("+arr[i]+","+arr[j]+")");
						}
					}
					
				}
			}
		}
	}
		public static void main(String[] args) {
			int arr[]= {2,4,1,7,3,6,5,9,11,12};
			System.out.println(Arrays.toString(arr));
			primePairSum(arr) ;
					
			
		}

	}



