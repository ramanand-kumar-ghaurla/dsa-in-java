package DSA.src.sorting;

public class BubbleSort {

    public static void  sortArray(int[] arr){

        for(int i = 0; i < arr.length; i++){

            boolean isSwapped = false;

            for( int j = 0; j < arr.length - i - 1; j++){

                if(arr[j] > arr[j +1]){
                    int temp ;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    isSwapped = true;
                }

            }

            if(isSwapped == false){
             return;
            }
        }

        for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);
            
        }

    }

    public static void main(String[] args) {
        
        int[] arr = { 1,54, 3,100, 4,54, 5, 9, 34};

        sortArray(arr);

        System.out.println("hello");

    }

}