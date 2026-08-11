package arrays;
import java.util.Arrays;
public class PrefixSumArray {
	
		public static void prefixSumArray(int arr[])
		{
			int sum=0;
			for(int i=0;i<=arr.length-1;i++)
			{
				sum=sum+arr[i];
				arr[i]=sum;
			}
		}
		public static void main(String[] args) 
		{
			int arr[]={1,3,2,4,5};
			System.out.println(Arrays.toString(arr));
			prefixSumArray(arr);
			System.out.println(Arrays.toString(arr));
		}
	}


