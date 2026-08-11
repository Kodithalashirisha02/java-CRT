package arrays;
import java.util.Arrays;
public class LeaaderElement {
	public static void leaderElement(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			boolean condn=true;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]<arr[j])
				{
					condn=false;
					break;	
				}
			}
			if(condn)
				System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,7,6,4,1,3,2};
		System.out.println(Arrays.toString(arr));
		leaderElement(arr);

		
		
		
	}

}
