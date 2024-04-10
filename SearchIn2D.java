package javaDSA;

import java.util.Arrays;

public class SearchIn2D {

	public static void main(String[] args) 
	{
		int[][] arr = {
				{2,23,22},
				{1,2,3,4,5},
				{11,22,33,44},
				{10,15,20,25}
		};  
		int target = 33;
		int []ans = search(arr,target);
		System.out.println(Arrays.toString(ans));
	}
	static int[] search(int [][]arr,int target) 
	{
		for(int row =0;row<arr.length;row++) 
		{
			for(int col =0;col<arr[row].length;col++) 
			{
				if(arr[row][col]==target) 
				{
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}
}
