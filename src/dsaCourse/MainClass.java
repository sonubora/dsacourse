package dsaCourse;

import dsaCourse.searching.LinearSearch;
import dsaCourse.sorting.BubbleSort;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" I am Main Method");
		LinearSearch s1 = new LinearSearch();// this way to create a object for a class, if we need to call a method of a given class
		s1.linearSearch();
		System.out.println(" I am Main Method called after linear ");
		
		BubbleSort s2 = new BubbleSort();
		s2.bubbleSortCode();
		
	}

}
