import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SelectionSort {
  
	//= Integer.valueOf(0)
	public static void main(String[] args) {
	
	
	Scanner scnr = new Scanner(System.in);
	
	System.out.println("How many numbers you want to put in ");
	String Size = scnr.next();
	Integer size1 = Integer.parseInt(Size);
	System.out.println ("What numbers");
	Integer [] apple = new Integer [size1];
	for (int i = 0; i < size1 ; i++) {
		String [] appless = new String [size1] ;
		appless [i] = scnr.next();
		apple [i] = Integer.parseInt(appless [i]);
	
	}
	BubbleSort(apple);
	//apple[0] = Integer.parseInt(ListOfNumbers);
	for (int i = 0; i < size1 ; i++) {
		System.out.println("List " + apple[i].toString());
	
	}
	
	
//	Integer[] djjkkj = new Integer[2];
	}
	

	public static void BubbleSort(Integer[] apple) {
		
		/*
		 * Implement selection sort on the wordList which is an ArrayList of strings
		 */
		 int list = apple.length;
		  for (int i = list - 1; i >0; i --) {
			for (int j = 0 ; j < i; j ++) {
				if (apple[j].compareTo(apple[j+ 1]) > 0) {
					int temp = apple[j];
					apple[j] = apple[j + 1];
					apple[j+1] = temp;
		//Collections.swap (apple, i, j);
				
			}
	
	
}
}}}