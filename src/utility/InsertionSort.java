/**
 * 
 */
package utility;

import shapes.Cone;
import shapes.Pyramid;
import shapes.Shape;
import shapes.SquarePrism;

//Java program for implementation of Insertion Sort
class InsertionSort {
 /*Function to sort array using insertion sort*/
 void sort(Shape arr[])
 {
     int n = arr.length;
     for (int i = 1; i < n; ++i) {
         Shape key = arr[i];
         int j = i - 1;

         /* Move elements of arr[0..i-1], that are
            greater than key, to one position ahead
            of their current position */
         while (j >= 0 && arr[j].compareTo(key) == -1) {
             arr[j + 1] = arr[j];
             j = j - 1;
         }
         arr[j + 1] = key;
     }
 }

 /* A utility function to print array of size n*/
 static void printArray(Shape[] arr)
 {
     int n = arr.length;
     for (int i = 0; i < n; ++i)
         System.out.print(arr[i] + " ");

     System.out.println();
 }

 // Driver method
 public static void main(String args[])
 {
     Shape[] arr = {new Cone(5.5, 5.0), new Pyramid(9.0, 5.0), new SquarePrism(3.0, 7.0)};

     InsertionSort ob = new InsertionSort();
     ob.sort(arr);

     printArray(arr);
 }
} /* This code is contributed by Rajat Mishra. */