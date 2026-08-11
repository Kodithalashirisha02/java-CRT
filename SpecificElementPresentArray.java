/*i/p: arr[2,4,5,7,9]
 * position:2
 * olp:element removed=4
 * arr=[2,5,7,9,0]
 * 
 * i/p:[2,5,1,7]
 * position:5
 * element not found
 * 
 */
 package arrays;

import java.util.Arrays;

public class SpecificElementPresentArray {
	public static void leftRotate(int arr[]) {
        int index=arr[0];
		
		for(int i=index;i<=arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
			
		}
	
	public static int removeElement(int arr[],int position) {
		int element=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(i==position-1) {
				element=arr[i];
				arr[i]=0;
				leftRotate(arr);
				
			}
		}
		return element;
	}
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6,7,8,2};
		System.out.println(Arrays.toString(arr));
		int position=2;
		if(position<=arr.length) {
			removeElement(arr,position);
			System.out.println(Arrays.toString(arr));
		}
	}

}


