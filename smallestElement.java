package arrays;

import java.util.Arrays;
class smallestElement 
{
	public static int smallestElement(int arr[]){
		int smallest=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]<smallest)
				smallest=arr[i];
		}
		return smallest;
	}
	public static void main(String[] args) 
	{
		int arr[]={2,3,4,8,9,1};
		System.out.println(Arrays.toString(arr));
		int ele=smallestElement(arr);
		System.out.println(ele);

	}
}
