package javaDSA;

public class Minimum {

	public static void main(String[] args) {
		int arr[]= {12,22,42,5,4,454};
		System.out.println("Minimum value in the array is "+minimum(arr));

	}
	public static int minimum(int arr[]) 
	{
		int min= arr[0];
		for(int i =1;i<arr.length;i++) 
		{
			if(arr[i]<min) 
			{
				min  = arr[i];
			}
		}
		return min;
	}

}
