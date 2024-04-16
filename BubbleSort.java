package javaDSA;

import java.util.Arrays;

public class BubbleSort {
	static void bubblesort(int[] arr) 
	{
		for(int i =0;i<arr.length;i++) {
			for(int j = 1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				
			}
		}
	}
	public static void main(String[] args) 
	{
		int arr[] = {60,40,30,20,10};
		bubblesort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
