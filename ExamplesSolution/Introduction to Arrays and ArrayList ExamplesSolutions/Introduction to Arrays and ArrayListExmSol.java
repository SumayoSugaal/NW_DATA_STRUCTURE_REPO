Maximum Value of an Array  io minimum oo aniga kudaray

import java.util.Arrays;
import java.util.Collections;
 
public class MinNMax {
    public static void main(String[] args)
    {
 
        // Initializing array of integers
        Integer[] num = { 2, 4, 7, 5, 9 };
 
        // using Collections.min() to
        // find minimum element
        // using only 1 line.
        int min = Collections.min(Arrays.asList(num));
 
        // using Collections.max()
        // to find maximum element
        // using only 1 line.
        int max = Collections.max(Arrays.asList(num));
 
        // printing minimum and maximum numbers
        System.out.println("Minimum number of array is : "
                           + min);
        System.out.println("Maximum number of array is : "
                           + max);
    }
}








reversing an Array

public class reverseArr{
  
    // function that reverses array and stores it 
    // in another array
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
  
        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
  
    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }
}

