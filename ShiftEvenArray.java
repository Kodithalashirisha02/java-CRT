package arrays;

import java.util.Arrays;

public class ShiftEvenArray {
	public static void leftRotate(int arr[],int index) {
		int temp=arr[index];
		for(int i=index;i<=arr.length-2;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	}
	public static int[] evenRotate(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			int ele=arr[i];
			if(ele%2==0)
			{
				leftRotate(arr,i);
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		evenRotate(arr);
		System.out.println(Arrays.toString(arr));
		
	}



}