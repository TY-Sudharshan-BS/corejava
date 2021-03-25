package com.tyss.mockpractice.arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Numbers {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(5);
		al.add(26);
		al.add(2);
		al.add(16);
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer i =  itr.next();
			if (i < 15) {
				itr.remove();
			}

		}
		System.out.println(al);

	}
}
