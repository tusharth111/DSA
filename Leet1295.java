package javaDSA;
//Find Numbers with even number of digits
/*
 Given array nums of integers ,return how many of them
 contains even number of digits 
 eg: {12,2,345,7896,446}
 here only 12 and 2 have even number of digits in the array
 
 * */
public class Leet1295 {
	static int findNumbers(int []nums) 
	{
		int count =0;
		for(int num : nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
		
	}
	static boolean even(int num) {
		int numberofDigits =digits(num);
		if(numberofDigits%2 ==0) {
			return true;
		}
		return false;
	}
	static int digits(int num) {
		if(num <0) {
			num = num *-1;
		}
		if(num==0) {
			return 1;
		}
		int count =0;
		while(num >0) 
		{
			count ++;
			num = num/10;
		}
		return count;
	}
	public static void main(String[] args) 
	{
	int []nums = {7896,234,12,23,-23 };
	System.out.println("there are "+findNumbers(nums)+"number of numbers having even numbers of digits  ");
	}
}
