package arrays;
import java.util.Arrays;
public class ProductMaxArray {
 static void maxElementPair(int arr[]) {
			int ele1=0;
			int maxprod=1;
			int ele2=0;
			for(int i=0;i<=arr.length-1;i++) {
				for(int j=i+1;j<=arr.length-1;j++) {
					int prod=arr[i]+arr[j];
					if(prod>maxprod) {
						maxprod=prod;
						ele1=arr[i];
						ele2=arr[j];
					}
				}
			}
			System.out.println("maxprod="+maxprod);
			System.out.println("The pairs are:("+ele1+","+ele2+")");
		}
		public static void main(String[] args) {
			int arr[]= {2,8,1,4,3};
			System.out.println(Arrays.toString(arr));
			maxElementPair(arr);
			
		}

	}



