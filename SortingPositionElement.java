/*WAPT sort only the even elements present in the given array in ascending order and retain the positions of all the other elements
 * i/p:[9,8,4,5,1,2,3,6]
 * o/p:[9,2,4,5,1,6,3,8]
 */ 
package arrays;
 import java.util.Arrays;
public class SortingPositionElement {
	public static void sortOnlyEvenElements(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0)
			{
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[j]%2==0 && arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {9,8,4,5,1,2,3,6};
		System.out.println(Arrays.toString(arr));
		sortOnlyEvenElements(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
