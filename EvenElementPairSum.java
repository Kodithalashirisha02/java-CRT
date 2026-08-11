package arrays;

public class EvenElementPairSum {
	public static void evenElement(int arr[]) {
	for(int i=0;i<=arr.length-1;i++) {
		if(arr[i]%2==0) {
		for(int j=i+1;j<=arr.length-1;j++) {
			if(arr[j]%2==0) {
				int sum=arr[i]+arr[j];
				if(sum%2==0) {
					System.out.println("The pairs of elements are:("+arr[i]+","+arr[j]+")");
					
				}
			}
			
	    }
	}
		
}
	
}
	public static void main(String[] args) {
		int arr[]= {2,4,1,7,3,6,12,5};
		System.out.println("Arrays.toString(arr)");
		 evenElement(arr); 
				
		
	}

}
