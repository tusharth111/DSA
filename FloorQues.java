package javaDSA;

public class FloorQues {
	//FLOOR is greatest no smaller then and equal to target
	private static int floor(int numArray[], int number_to_search_for) {
        int start = 0;  
        int end = numArray.length - 1;
        if(number_to_search_for > numArray[end]) 
        {
        	return -1;
        }
        while (start <= end){
            int mid = start +  (end - start)  / 2;
            int middleIndexNumber = numArray[mid];
            if (number_to_search_for == middleIndexNumber){
                return mid;
            }
            if (number_to_search_for < middleIndexNumber){
                end = mid - 1;
            }
            if (number_to_search_for > middleIndexNumber){
                start = mid + 1;
            }
        }
        return end;
  }
    public static void main(String args[]) {
        
        int[] arrayofnums = {2,3,5,9,14,16,18};
        
       int result =floor(arrayofnums, 15);
       System.out.println("Floor  : "+ arrayofnums[result]);
    }
}
