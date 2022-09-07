package com.java.collection.fifthex;

import java.util.Comparator;

public class IdComparator implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {

		if (o1.getItemId() == o2.getItemId())
			return 0;
		else if (o1.getItemId() > o2.getItemId())
			return 1;

		else
			return -1;

	}

}