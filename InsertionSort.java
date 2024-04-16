package javaDSA;

import java.util.Arrays;

public class InsertionSort {

	static void insertion(int arr[]) 
	{
		int n = arr.length;
		for(int i =0;i<n-1;i++) 
		{
			for(int j =i+1;j>0;j--) 
			{
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
				else 
				{
					break;
				}
			}
		}
	}
	static void swap(int[] arr, int first ,int second ) 
	{
		int temp= arr[first];
		arr[first]=arr[second];
		arr[second] = temp;
	}
	public static void main(String[] args) 
	{
		int arr[] = {5,4,3,2,1,0};
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}

}
