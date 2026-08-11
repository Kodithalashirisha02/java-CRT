package arrays;

import java.util.Arrays;
//import java.util.Scanner;
public class ShiftZeroesToEnd {
	public static void leftRotate(int arr[],int index) {
		int temp=arr[index];
		for(int i=index;i<=arr.length-2;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	}
	public static int[] shiftZeroesToEnd(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			int ele=arr[i];
			if(ele==0)
			{
				leftRotate(arr,i);
			}
		}
		return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,3,6,0,0,4,5,6};
		System.out.println(Arrays.toString(arr));
		shiftZeroesToEnd(arr);
		System.out.println(Arrays.toString(arr));
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int arr[]=new int[5];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter the size the array"+i);
			int arr[i]=sc.nextInt();
			
		}
		int res[]=shiftZeroesToEnd(arr);
		System.out.println(Arrays.toString(res));
		
		*/

	}

}
