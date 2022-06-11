package utility;

import shapes.Cone;
import shapes.Pyramid;
import shapes.Shape;
import shapes.SquarePrism;

public class BubbleSort {
    void bubbleSort(Shape[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].getHeight() < arr[j+1].getHeight())
                {
                    // swap arr[j+1] and arr[j]
                    Shape temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
  
    /* Prints the array */
    void printArray(Shape[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
  
    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        Shape[] arr = {new Cone(4.0, 5.0), new Pyramid(9.0, 5.0), new SquarePrism(3.0, 7.0)};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
/* This code is contributed by Rajat Mishra 
 * https://www.geeksforgeeks.org/bubble-sort/
 * */
 