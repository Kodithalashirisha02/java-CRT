/*WAP to find the frequency of only the even elements present in the given array
i/p:[2,3,4,2,5,3,7,8,4]
o/p:frequency of even elements
element=frequency
		2=2
		4=2
		8=1;
i/p:[3,5,7,9]
o/p:No even elements present
*/
package arrays;
import java.util.Arrays;
public class FrequencyEvenElement {
	public static int countEvenDigit(int arr[]) {
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]%2==0)
			count++;
		}
		return count;
	}
public static int[] frequenyEven(int arr[]) {
	int duplicate=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=duplicate && arr[i]%2==0) {
		int count=1;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]!=duplicate && arr[i]==arr[j])
			{
				arr[j]=duplicate;
				count++;
			}
		}
		System.out.println(arr[i]+"="+count);
		}
	}
			
	return arr;
	
	
}
public static void main(String[] args) {
	int arr[]= {2,3,4,2,5,3,7,8,4};
	System.out.println(Arrays.toString(arr));
	int count=countEvenDigit(arr);
	if(count>0) {
		System.out.println("frequency of even element");
		System.out.println("Elements=frequency");
	    frequenyEven(arr);
	}
	else
		System.out.println("no even elements");
}
}