/*WAPT split the given arrays where one subarray consist of the all the positive no's,second subarray consists of alll the negative no.s and third a;
 consist of zeros 
arr-->[1,4,0,6,9,-3,-7,0,2,0,-9] brr-->[1,4,6,9,2] crr-->[-3,-7,-9]  drr->[0,0,0]
*/
package arrays;
import java.util.Arrays;
public class positivenegativearray {
	public static int countPositive(int arr[])
	{
		int count=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
			{
				count++;
			}
		
		}
		return count;
	}
	public static int countNegative(int arr[])
	{
		int count1=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<0)
			{
				count1++;
			}
		
		}
		return count1;
	}
	public static void copyElements(int arr[],int brr[],int crr[]) {
		int index1=0;
		int index2=0;
		for(int i=0;i<=arr.length-1;i++) {
			int ele=arr[i];
			if(ele>0) 
				brr[index1++]=ele;
				else if(ele<0)
					crr[index2++]=ele;
			
		}
		

	}
	public static void main(String[] args) {
		int arr[]= {1,4,0,6,-3,-7,0,2,0,-9};
		System.out.println(Arrays.toString(arr));
		int countPositive=countPositive(arr);
		int countNegative=countNegative(arr);
		int countZero=arr.length-countPositive-countNegative;
		int brr[]=new int[countPositive];
		int crr[]=new int[countNegative];
		int drr[]=new int[countZero];
		copyElements(arr,brr,crr);
		System.out.println("positive array"+Arrays.toString(brr));
		System.out.println("negative array"+Arrays.toString(crr));
		System.out.println("zeroth array"+Arrays.toString(drr));
		
	}

}
