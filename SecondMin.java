package Array2D;

import java.util.Scanner;

public class SecondMin {
	/*
	-1 2 0			-- 2nd Maximum=6
	 4 5 6			-- 2nd Minimum=0
	 3 4 10
*/

public static void find2ndMaximumElement(int arr[][]) 
{
	int max1 = Integer.MIN_VALUE;
	int max2 = Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) 
	{
		for (int j = 0; j < arr.length; j++) 
		{
			int ele = arr[i][j];
			if(ele>max1)
			{
				max2=max1;
				max1=ele;
			}
			else if(ele>max2 && ele != max1)
				max2=ele;
		}
	}
	System.out.println("\nSecond Maximum Element Is:- "+max2);
}

public static void find2ndMinimumElement(int arr[][]) 
{
	int min1 = Integer.MAX_VALUE;
	int min2 = Integer.MAX_VALUE;
	for (int i = 0; i < arr.length; i++) 
	{
		for (int j = 0; j < arr.length; j++) 
		{
			int ele = arr[i][j];
			if(ele<min1) 
			{
				min2=min1;
				min1=ele;
			}
			else if(ele<min2 && ele != min1)
				min2=ele;
		}
	}
	System.out.println("\nSecond Minimum Element Is:- "+min2);
}

public static void main(String[] args) 
{
	int arr[][] = {{-1,2,0},{4,5,6},{3,4,10}};
	UtilityClass.printMatrixMethod(arr);
	
	find2ndMaximumElement(arr);
	find2ndMinimumElement(arr);
}

}




























