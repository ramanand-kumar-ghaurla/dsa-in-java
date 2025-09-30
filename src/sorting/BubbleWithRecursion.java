package sorting;

public class BubbleWithRecursion {

    // we can avoid forloop with recursion 

    public static void sortWithRecursion(int[] arr, int k ){

        // in this function 'k ' is the position to which the swapping of elements will perform to sort the array and 
        //avoid further leements which already sorted to optamize the aproach

   
        System.out.println("the k value is "+ k);
        if (k == 0){
            return;
        }

        // create a for loop to iterate the element to sort 

        for(int i = 0; i < k-i-1; i++){

            // swap the element if required 
              System.out.println("index is :- " + i +" and "+ "vqlue is "+ arr[i]);

            if(arr[i] > arr[i+1]){
                System.out.println("condion is true, index is :- " + i +" and "+ "vqlue is "+ arr[i]);
                int swap = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = swap;
            }
        }

        // call  the same function by reducing the k value

         for (int idx = 0; idx < arr.length; idx++) {
            System.out.println(arr[idx]);
            
        }
        sortWithRecursion(arr, k-1);

       
    }

    public static void main(String[] args) {
        
        int[] arr = {1 ,4,0,100, 45, 90, 43, 89};
        int[] arr4 = {0, 3, 45, 67, 89, 94, 100};

       // sortWithRecursion(arr4, arr.length);

       sortWithPureRecursion(arr, arr.length - 1, 0);


    }
    
    /*
     * we can optamize this aproach further by avoiding the inner for loop in this 
     * function
     * we can pass one more argument to this function ( the value of i )
     * and call this function by increasig the i value
     */

     public static void sortWithPureRecursion(int[] arr,int k ,int i){

        // check if k bacame zero 
        if (k == 0 ){
            return;
        }

        // check if the value of k and i is same , it means - the one iteration over array is complete and we need to call this func by reducing the k 

        if ( i == k){
            sortWithPureRecursion(arr,k-1, 0);
            return;
        }

        // chaek if the first element is greater than second and swap

        if(arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        for (int idx = 0; idx < arr.length; idx++) {

            System.out.println(arr[idx]);
            
        }

        System.out.println("************");
        sortWithPureRecursion(arr, k, i+1);

     }
}
