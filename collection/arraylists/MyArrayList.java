package com.tyss.collection.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> { 
	private Object eleData[]; 
	private final int DEF_SIZE = 5;
	private int size = 0;

	MyArrayList() {
		this.eleData = new Object[DEF_SIZE];
	} 

	public void increaseSize(Object el) {
		System.out.println("method called");
		if (size == DEF_SIZE) {
			System.out.println("inside if block");
			System.out.println("size is " + size);
			int prevsize = eleData.length;
			System.out.println("prev size " + prevsize);
			int newSize = (prevsize * 2);
			System.out.println("new size " + newSize);
			eleData = Arrays.copyOf(eleData, newSize);

		}
		this.eleData[size] = el;
		size++;
	}

	@Override
	public String toString() {
		String s = new String("[");
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				s = s + eleData[i];
			} else {
				s = s + eleData[i] + ", ";
			}
		}
		s = s + "]";
		return s;
	}
	
//	public void remove

//	for (Iterator<MyArrayList> iter = ((Object) eleData[i]).iterator(); iter.hasNext(); ) {
//		MyArrayList var = iter.next();
//	    //body of the `loop
//	});
	
	
	public void forEach() {
		for(Object ob: eleData) {
			System.out.println(ob);
		}
	}

	// own iterataor implementation
	public Iterator<E> iterator() {
		return new MyItr();
	}

	private class MyItr implements Iterator<E> {

		private int index;

		public boolean hasNext() {
			return (index < size) ? true : false;
		}

		@Override
		public E next() {
			E e = (E) eleData[index];
			index++;
			return e;
		}

	}

}
