package arrays;
import java.util.Arrays;
public class SplitAscending {
	public static void sortingInAscending(int[] arr) {
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<=arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
	}
	public static void sortingDescending(int[] arr) {
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<=arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
	}
		public static int countEven(int arr[]) {
			int count=0;
			for(int i=0;i<=arr.length-1;i++)
			{
				if (arr[i]%2==0)
					count++;
			}
			return count;
		}
		public static int[] merge(int a[],int b[]) {
			int res[]=new int[a.length+b.length];
					for(int i=0;i<=a.length-1;i++) {
						res[i]=a[i];
					}
			int index=a.length;
			for(int i=0;i<=b.length-1;i++) {
				res[index++]=b[i];
			}
			return res;
		}
	public static void splitSortMerge(int[] arr) {
		int countEven=countEven(arr);
		int countOdd=arr.length-countEven;
		int[] evenArray=new int[countEven];
		int[] oddArray=new int[countOdd];
		int index1=0;
		int index2=0;
		for(int i=0;i<=arr.length-1;i++) {
			int ele=arr[i];
			if(ele%2==0) 
				evenArray[index1++]=ele;
			else
				oddArray[index2++]=ele;
			System.out.println("even array"+Arrays.toString(evenArray));
			System.out.println("odd array"+Arrays.toString(oddArray));
			sortingInAscending(oddArray);
			sortingDescending(evenArray);
			System.out.println("After sorting");
			System.out.println("even array"+Arrays.toString(evenArray));
			System.out.println("odd array"+Arrays.toString(oddArray));
		
			int res[]=merge(evenArray,oddArray);
			System.err.println("after merging"+Arrays.toString(res));  
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {98,75,99,45,66,23,77};
		splitSortMerge(arr);
		System.err.println(Arrays.toString(arr));
		
		

	}

}
