package com.tyss.mockpractice.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TestMobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile(1000, "Samsung");
		Mobile m2 = new Mobile(5000, "Iphone");
		Mobile m3 = new Mobile(500, "Nokia");
		SortMobileByBrand brands = new SortMobileByBrand();
		TreeSet<Mobile> tree = new TreeSet<Mobile>(brands);
		tree.add(m1);
		tree.add(m2);
		tree.add(m3);
		Iterator<Mobile> itr = tree.iterator();
		while (itr.hasNext()) {
			Mobile s = itr.next();
			
			System.out.println(s);
		}
	}
}
