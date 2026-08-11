package arrays;
import java.util.Arrays;
public class ShiftAllTheVowels {
	public static boolean checkVowels(char ele) {
		return ele=='a'||ele=='e'||ele=='i'||ele=='o'||ele=='u';
			/*return true;
		else
			return false;*/
	}
	
		public static void leftRotate(char arr[],int index) {
			char temp=arr[index];
			for(int i=index;i<=arr.length-2;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
		}
		public static void negativeElements(char arr[]) {
			for(int i=0;i<=arr.length-1;i++)
			{
				if(checkVowels(arr[i])) {
					 leftRotate(arr,i);
					 
				}
			}
		}
	public static void main(String[] args) {
		char arr[]= {'a','b','e','j','o','l'};
		System.out.println(Arrays.toString(arr));
		negativeElements(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
