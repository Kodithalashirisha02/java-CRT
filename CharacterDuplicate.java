package arrays;

import java.util.Arrays;

public class CharacterDuplicate {
	public static char[] removeDuplicates(char arr[]) {
		char duplicate=Character.MIN_VALUE;
		int count=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=duplicate) {
				for(int j=i+1;j<=arr.length-1;j++) {
					if(arr[j]!=duplicate && arr[i]==arr[j]) {
						arr[j]=duplicate;
						count++;
					}
				}
			}
		}
		char res[]=new char[arr.length-count];
		int index=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]!=duplicate)
				res[index++]=arr[i];
		}
		return res;
	}
	public static void main(String[] args) {
		char res[]= {'a','e','i','o','u','a','e','u'};
		System.out.println(Arrays.toString(res));
		char res1[]=removeDuplicates(res);
		System.out.println(Arrays.toString(res1));
	}

}
