package DSA.src.sorting;

public class Selection {
    
     static int findMin( int[] arr, int i ){

        int minIndex = i ;
       

        for (int j = i+1; j < arr.length; j++ ) {

            if(arr[j] < arr[minIndex] ){
                minIndex = j;
            }

          
            
        }
        

        return minIndex;
    }

   static  int[] selectionSort(int [] arr){

        for( int i = 0; i < arr.length; i++){

            int minIndex = findMin(arr, i);

            if(( minIndex != i) ){
                int temp;

                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;

            }

          


        }
          return arr;
    }

    public static void main(String[] args) {
        
        

        int [] arr1 = {8, 45, 89,34,54};

        int[] sorted= selectionSort(arr1);

        for (int i = 0; i < sorted.length; i++) {

            System.out.println(sorted[i]);
            
        }
    }
}
