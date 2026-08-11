package arrays;

import java.util.Arrays;

public class ShiftAllTheZeroesBeginArray {
	public static void rightRotate(int arr[],int index) {
		int temp=arr[index];
		for(int i=index;i>=1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}
	public static int[] shiftZeroes(int arr[]) {
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==0) {
				 rightRotate(arr,i);
			}
		}
		return arr;
	}
public static void main(String[] args) {
	int arr[]= {1,0,0,3,4,0,0,5,6};
	System.out.println(Arrays.toString(arr));
	shiftZeroes(arr);
	System.out.println(Arrays.toString(arr));
	
	
}
}