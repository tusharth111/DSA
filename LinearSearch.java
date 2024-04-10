package javaDSA;

public class LinearSearch {
	private static int linearsearch(int [] arr,int item) 
	{
		for(int i = 0;i<arr.length;i++) 
		{
			if(arr[i]==item) 
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) 
	{
		int arr[] = {21,44,22,12,54,43};
		
		int result =linearsearch(arr,12);
		System.out.println("the element is at index : "+result);
		if(result == -1)
		{
			System.out.println("your element does not exist in the array ");
		}
		

	}

}
