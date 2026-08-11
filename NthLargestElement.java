package arrays;
import java.util.Arrays;
public class NthLargestElement {
	public static void descendingOrder(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++)
			{
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
	}
	public static int nthLargestElement(int arr[],int n) {
		descendingOrder(arr);
		return arr[n-1];
			}
	public static void main(String args[]) {
		int arr[]= {2,5,3,8,1,6};
		System.out.println(Arrays.toString(arr));
		int n=3;
		if(n<=arr.length)
		{
			int ele=nthLargestElement(arr,n);
			System.out.println("nth largest element"+ele);
		}
		else
		{
			System.out.println("cannot find nth largest");
		}
			
			
	 }

	}
