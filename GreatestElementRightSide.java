package arrays;

import java.util.Arrays;

public class GreatestElementRightSide {
	/*public static void greatestRightSide(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			int greatest=arr[i];
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]>greatest) {
					greatest=arr[j];
					
				}
			}
			arr[i]=greatest;
		}
		arr[arr.length-1]=-1;
		
	}*/
	public static void greatestRightSide(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]>arr[i])
					arr[i]=arr[j];
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {5,7,2,4,1,3};
		System.out.println(Arrays.toString(arr));
		greatestRightSide(arr);
		System.out.println(Arrays.toString(arr));
	
	}

}
