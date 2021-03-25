package com.tyss.collection.treemaps;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TestMyTree {
	public static void main(String[] args) {
		MyTreeMap tmaps = new MyTreeMap("Smith");
		MyTreeMap tmaps1 = new MyTreeMap("Anu");
		MyTreeMap tmaps2 = new MyTreeMap("ziva");
		TreeMap<MyTreeMap, Integer> maps = new TreeMap<MyTreeMap, Integer>();
		maps.put(tmaps, 10);
		maps.put(tmaps1, 30);
		maps.put(tmaps2, 20);
		Set<MyTreeMap> s = maps.
		Iterator<MyTreeMap> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
//		System.out.println(maps);
	}
}
