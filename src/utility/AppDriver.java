package utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.*;

import shapes.*;

public class AppDriver {

	public static void main(String[] args) throws IOException {
		
		ShapeManager readFile = new ShapeManager();
		readFile.readFile("res/polyfor1.txt");
		//readFile.printArray();
		//readFile.measureBubble();
		//readFile.measureMerge();
		//readFile.shellSort();
		//readFile.measureSelection();
		readFile.measureQuick();
		
//		System.out.println("Polyfor3.txt----------------------------");
//		
//		readFile.readFile("res/polyfor3.txt");
//		readFile.printArray();
//		
//		System.out.println("Polyfor5.txt----------------------------");
//		readFile.readFile("res/polyfor5.txt");
//		readFile.printArray();
//		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
	}
		

	 


}
