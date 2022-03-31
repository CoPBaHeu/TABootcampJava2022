package sef.module8.activity;

//Needs to be completed

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		TreeSet names = new TreeSet ();
		names.add("Tom");
		names.add("Janis");
		names.add("Kate");
		names.add("Carlos");
		names.add("Philipp");
		names.add("Carlos");

		//TODO: 2 - Call print method to print the set passed as its parameter.
		SetActivity obj = new SetActivity();
		obj.print(names);
	}
	
	void print(Set set)
	{
		//TODO: 3 - Type code to print this set
		//Notice the order in which elements get printed.
		Iterator<String> it = set.iterator();
		System.out.println("Let's check");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
