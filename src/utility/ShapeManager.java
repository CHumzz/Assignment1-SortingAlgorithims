package utility;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import shapes.Shape;

public class ShapeManager {

	private File file;
	public Shape[] shapes;
	double start, end;
	static double total;

	public ShapeManager() {

	}

	public void readFile(String fileName) throws FileNotFoundException {

		file = new File(fileName);
		Scanner scan = new Scanner(file);
		int size = scan.nextInt();
		shapes = new Shape[size];
		int i = 0;
		while (scan.hasNext()) {
			String shapeName = scan.next();
			double height = scan.nextDouble();
			double other = scan.nextDouble();

			try {

				Class<?> cls = Class.forName("shapes." + shapeName);
				Class<?> paramTypes[] = new Class[2];
				paramTypes[0] = Double.TYPE;
				paramTypes[1] = Double.TYPE;
				Constructor<?> ct = cls.getConstructor(paramTypes);
				Object[] argList = new Object[2];
				argList[0] = height;
				argList[1] = other;
				Object o = ct.newInstance(argList);
				shapes[i++] = (Shape) o;

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void measureBubble() {

		System.out.println("UnSorted");
		printArray();
		start = System.nanoTime();
		BubbleSort ob = new BubbleSort();
		ob.bubbleSort(shapes); // this shapes needs to references our AppDrivers res File
		end = System.nanoTime();
		total = (double) ((end - start) / Math.pow(10, 9));
		System.out.println("Sorted");
		printArray();
		System.out.printf("Time Complexity: %1.2f %s", total, "Seconds");

	}

	public void measureMerge() {
		System.out.println("UnSorted");
		printArray();
		start = System.nanoTime();
		MergeSort ms = new MergeSort();
		ms.sort(shapes, 0, shapes.length - 1); // this shapes needs to references our AppDrivers res File
		end = System.nanoTime();
		total = (double) ((end - start) / Math.pow(10, 9));
		System.out.println("Sorted");
		printArray();
		System.out.printf("Time Complexity: %1.2f %s", total, "Seconds");
	}

	public void measureQuick() {
		System.out.println("UnSorted");
		printArray();
		start = System.nanoTime();
		QuickSort.quickSort(shapes, 0, shapes.length - 1); // this shapes needs to references our AppDrivers res File
		end = System.nanoTime();
		total = (double) ((end - start) / Math.pow(10, 9));
		System.out.println("Sorted");
		printArray();
		System.out.printf("Time Complexity: %1.2f %s", total, "Seconds");
	}

	public void shellSort() {
		System.out.println("UnSorted");
		printArray();
		start = System.nanoTime();
		ShellSort ss = new ShellSort();
		ss.sort(shapes); // this shapes needs to references our AppDrivers res File
		end = System.nanoTime();
		total = (double) ((end - start) / Math.pow(10, 9));
		System.out.println("Sorted");
		printArray();
		System.out.printf("Time Complexity: %1.2f %s", total, "Seconds");
	}

	public void measureSelection() {
		System.out.println("UnSorted");
		printArray();
		start = System.nanoTime();
		SelectionSort ss = new SelectionSort();
		ss.sort(shapes); // this shapes needs to references our AppDrivers res File
		end = System.nanoTime();
		total = (double) ((end - start) / Math.pow(10, 9));
		System.out.println("Sorted");
		printArray();
		System.out.printf("Time Complexity: %1.2f %s", total, "Seconds");

	}

	public void measureInsert() {

		System.out.println("UnSorted");
		printArray();
		start = System.nanoTime();
		InsertionSort ob = new InsertionSort();
		ob.sort(shapes); // this shapes needs to references our AppDrivers res File
		end = System.nanoTime();
		total = (double) ((end - start) / Math.pow(10, 9));
		System.out.println("Sorted");
		printArray();
		System.out.printf("Time Complexity: %1.2f %s", total, "Seconds");

	}

	public void printArray() {
		int n = shapes.length;
		for (int i = 0; i < n; i += 999)
			System.out.print(shapes[i] + " ");
		System.out.println();
	}

}
