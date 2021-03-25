package com.tyss.mockpractice.arraylists;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Employee {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector<String>();
		v1.add("yask");
		v1.add("admd");
		v1.add("msjjs");
		v1.add("zckd");
		v1.add("aadmk");
		Collections.sort(v1);
		Iterator<String> itr = v1.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}

	}
	
}
