package com.java.collection.fifthex;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {

		Vector<Item> v = new Vector<Item>();
		v.add(new Item(101, "tea", 30));
		v.add(new Item(105, "sugar", 55));
		v.add(new Item(103, "coffee", 40));
		v.add(new Item(102, "milk", 100));
	

		Collections.sort(v, new IdComparator());

		for (Item i : v)

			System.out.println(
					"Items Id: " + i.getItemId() + "  Items NAME:  " + i.getName() + "  Item price:  " + i.getPrice());
	}

}
