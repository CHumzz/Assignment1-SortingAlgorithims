package utility;

import shapes.Cone;
import shapes.Pyramid;
import shapes.Shape;
import shapes.SquarePrism;

public class SelectionSort {
	void sort(Shape arr[])
    {
        int n = arr.length;
  
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j].getHeight() > arr[min_idx].getHeight())
                    min_idx = j;
  
            // Swap the found minimum element with the first
            // element
            Shape temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
  
    // Prints the array
    void printArray(Shape[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
  
    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        Shape[] arr = {new Cone(4.0, 5.0), new Pyramid(9.0, 5.0), new SquarePrism(3.0, 7.0)};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
/* This code is contributed by Rajat Mishra
 https://www.geeksforgeeks.org/selection-sort/ */
