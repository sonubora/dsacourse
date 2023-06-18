package dsaCourse;

import dsaCourse.searching.LinearSearch;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" I am Main Method");
		LinearSearch search = new LinearSearch();// this way to create a object for a class
		search.linearSearch();
		System.out.println(" I am Main Method called after linear ");
	}

}
