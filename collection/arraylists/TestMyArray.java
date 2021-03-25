package com.tyss.collection.arraylists;

import java.util.Iterator;

public class TestMyArray {
	public static void main(String[] args) {
		MyArrayList<Integer> array = new MyArrayList<Integer>();

		array.increaseSize(10);
		array.increaseSize(20);
		array.increaseSize(10);
		array.increaseSize(20);
		array.increaseSize(20);
		array.increaseSize(10);
		array.increaseSize(20);
		array.increaseSize(10);
		array.increaseSize(20);
		array.increaseSize(20);

//		System.out.println(array);
//		for(Object o:array) {
//			System.out.println(o);
//		}

		Iterator<Integer> itr = array.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
//		array.forEach();

	}

}
