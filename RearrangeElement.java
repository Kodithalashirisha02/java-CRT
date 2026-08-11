/*i/p: arr=[1,2,3,4,5,6]
olp:[1,6,2,5,3,4]
*/
package arrays;

import java.util.Arrays;

public class RearrangeElement {
	public static void rearrangeElement(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			if(i%2==0) {
				int ele=arr[i];
				int index=i;
				for(int j=i+1;j<=arr.length-1;j++) {
					if(arr[j]<ele) {
						ele=arr[j];
						index=j;
					}
				}
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
			}
			else {
						int ele=arr[i];
						int index=i;
						for(int j=i+1;j<=arr.length-1;j++) {
							if(arr[j]>ele) {
								ele=arr[j];
								index=j;
							}
						}
						int temp=arr[i];
						arr[i]=arr[index];
						arr[index]=temp;
				
			}
		}
		
			
				
	}

	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		rearrangeElement(arr);
		System.out.println(Arrays.toString(arr));
		
	}
		
	}

