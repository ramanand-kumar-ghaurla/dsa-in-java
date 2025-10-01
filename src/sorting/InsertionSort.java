package sorting;

/* Insertion Sort :-
 * In Insertion Sort we devide the array in two segament : one is sorted and another is unsorted
 * we start for loop from i from index 1 consdring before elements are sorted
 * We define another for loop to shigting the elements by comparing the element previous (j = i-1) and current element (i)
 * if ( j > i) - we shift the j element to (j+1 ) position and decrement the j
 * we repeat this process until all elements put their right position
 */

public class InsertionSort{

   static void sortWithInsertion( int[] arr){

    // for loop for increasing the idx

    for (int idx = 1; idx < arr.length; idx++) {

        int currentElement = arr[idx];
        int j = idx-1;

        
        // define the inner loop for shifting the elements

      while( j >= 0 && arr[j] > currentElement){

        // if element positioned on arr[j] is greater than its just after positioned element then shift this to next position

        arr[j+1] = arr[j];

        j--;
      }
      
         arr[j+1] = currentElement;
    }

    for (int idx = 0; idx < arr.length; idx++) {
       System.out.println(arr[idx]);
        
    }



   }

   public static void main(String[] args) {
    
    int[] arr = { 1,94,100, 10, 15, 4, 8,5, 67, 90,2,0,9};

    sortWithInsertion(arr);
   }

}