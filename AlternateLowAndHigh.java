package arrays;

import java.util.Arrays;

public class AlternateLowAndHigh {
	public static int[] alternateLowAndHigh(int arr[]) {
		int i=0;
		int j=arr.length-1;
		int[]  res=new int[arr.length];
		int k=0;
		while(i<j) {
			res[k++]=arr[i++];
			res[k++]=arr[j--];
		}
		if(arr.length%2!=0)
			res[k]=arr[i];
		return res;
	}
	public static void main(String args[]) {
		int arr[]= {1,3,2,6,5,4};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int ele[]=alternateLowAndHigh(arr);
		System.out.println(Arrays.toString(ele));

	}
	

}

