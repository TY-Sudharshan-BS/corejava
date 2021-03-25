package com.tyss.collection.treemaps;

import java.util.Comparator;

public class MyTreeMap implements Comparator<MyTreeMap> {
	String name;

	public MyTreeMap(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compare(MyTreeMap o1, MyTreeMap o2) {
		return o1.name.compareTo(o2.name);
	}
}
