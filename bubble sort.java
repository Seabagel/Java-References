import java.util.*;

class Main {
  public static void main(String[] args) {
    int[] arr = {4,3,2,1};

    boolean[] arrSorted = new boolean[arr.length-1];
    Arrays.fill(arrSorted, true);
    
    boolean[] arrCompare = new boolean[arr.length-1];
    Arrays.fill(arrCompare, false);

    while(!Arrays.equals(arrCompare, arrSorted)){
      
      for(int i = 0; i < arr.length-1; i++){
        for(int x : arr){
          System.out.printf("%d, ",x);
        } // end for
        System.out.println(""); // newline
        
        if(arr[i] > arr[i+1]){
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
          arrSorted[i] = true;
          System.out.printf("%d > %d = %b",arr[i+1], arr[i], arrSorted[i]);
          System.out.println("");
        } else {
          arrSorted[i] = false;
          System.out.printf("%d > %d = %b",arr[i], arr[i+1], arrSorted[i]);
          System.out.println("");
        } // end if
        
      } // end for
      
      for(int x : arr){
        System.out.printf("%d, ",x);
      } // end for
      
      System.out.println(""); // newline
      
      if(Arrays.equals(arrCompare, arrSorted)){
        System.out.println("Finished Sorting");
      }
      
      System.out.println(""); // newline
    } // End while
  }
}