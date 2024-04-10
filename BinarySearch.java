package javaDSA;

class BinarySearch {
    private static int binarySearch(int numArray[], int number_to_search_for) {
        int low = 0;  
        int high = numArray.length - 1;
        
        while (low <= high){
            int middleIndex = low +  (high - low)  / 2;
            int middleIndexNumber = numArray[middleIndex];
            
            if (number_to_search_for == middleIndexNumber){
                return middleIndex;
            }
            if (number_to_search_for < middleIndexNumber){
                high = middleIndex - 1;
            }
            if (number_to_search_for > middleIndexNumber){
                low = middleIndex + 1;
            }
        }
        
        return -1;
  }
    public static void main(String args[]) {
        
        int[] arrayofnums = {2,3,6,8,9,13,20,24,26,28,30};
        
       int result =binarySearch(arrayofnums, 20);
       System.out.println("Element we found is : "+ arrayofnums[result]);
        // 5
        
    }

}