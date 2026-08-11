package arrays;
import java.util.Arrays;
public class LargestElement {
	
		public static int largestElement(int arr[])
		{
			int largest=arr[0];
			for(int i=1;i<=arr.length-1;i++)
			{
				if(arr[i]>largest)
					largest=arr[i];
			}
			return largest;
		}

		public static void main(String[] args) 
		{
			int arr[]={2,5,3,8,1,6};
			System.out.println(Arrays.toString(arr));
			int ele=largestElement(arr);
			System.out.println(ele);

		}
				
	


}
