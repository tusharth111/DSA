package javaDSA;

public class SelectionSort {
	static void selection(int[] arr) 
	{
		int n = arr.length;
		// one by one move boundary of unsorted subarray
		for(int i =0;i<n-1;i++) {
			int min_index = i;
			for(int j =i+1;j<n;j++) {
				//find the minimum element in unsorted array
				if(arr[j]<arr[min_index]) {
					min_index = j;
				}
			}
			//Swap the found min element with the first
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
	static void printArray(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int arr[] = {64,25,12,22,11};
		selection(arr);
		System.out.println("Sorted array is : ");
		printArray(arr);
	}

}
