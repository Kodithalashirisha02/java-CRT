package arrays;

import java.util.Arrays;

public class RemoveDuplicate {
	public static int[] removeDuplicates(int []arr) {
		int duplicate=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=duplicate) {
				for(int j=i+1;j<=arr.length-1;j++) {
					if(arr[j]!=duplicate && arr[i]==arr[j]) {
						arr[j]=duplicate;
						count++;
						
					}
				}
			}
		}
		if(count>0) {
		int []res=new int[arr.length-count];
		int index=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=duplicate)
				res[index++]=arr[i];
		
		}
		return res;
		}
		return arr;
	}
public static void main(String[] args) {
	int res[]= {2,6,5,3,3,4,6,7,4};
	System.out.println(Arrays.toString(res));
	int res1[]=removeDuplicates(res);
	System.out.println(Arrays.toString(res1));
	
}
}
