package com.tyss.collection.comparator;

import java.util.Comparator;

public class MyComparator2<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		String i1 = (String) o1;
		String i2 = (String) o2;
		return i1.compareTo(i2);

	}

}
