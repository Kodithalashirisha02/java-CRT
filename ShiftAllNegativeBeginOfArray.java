package arrays;

import java.util.Arrays;

public class ShiftAllNegativeBeginOfArray {
	public static void rightRotate(int arr[],int index) {
		int temp=arr[index];
		for(int i=index;i>=1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}
	public static int[] negativeElements(int arr[]) {
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<0) {
				 rightRotate(arr,i);
			}
		}
		return arr;
	}
public static void main(String[] args) {
	int arr[]= {0,-1,5,-3,-4,2,-5};
	System.out.println(Arrays.toString(arr));
	negativeElements(arr);
	System.out.println(Arrays.toString(arr));
	
	
}

}
