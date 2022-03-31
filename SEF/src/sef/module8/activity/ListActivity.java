package sef.module8.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a list of names. Use ArrayList.
		List l = new ArrayList();
		l.add("n");
		l.add("d");
		l.add("r");
		l.add("e");
		l.add("i");
		l.add(0,"A");
		//TODO: 2 - Call print method to print the list passed as its parameter.
		ListActivity obj = new ListActivity();
		obj.print(l);
	}
	
	void print(List list)
	{
		//TODO: 3 - Type code to print this list
		//Notice the order in which elements get printed.
		Iterator<String> it = list.iterator();
		System.out.println("And now welcome...");
		while (it.hasNext()) {
			System.out.print(it.next());
		}
	}
}
