package arrays;
import java.util.Arrays;
public class FrequencyOfEachElement {
	public static int[] frequencyElement(int arr[]) {
	int duplicate=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=duplicate) {
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
		int[] arr= {2,3,4,5,2,3,4,7,8};
		System.out.println(Arrays.toString(arr));
		 frequencyElement(arr);

	
		
	}

}
