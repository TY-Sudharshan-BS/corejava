package com.tyss.collection.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddArrayList {
	public static void main(String[] args) {
//		ArrayList arrays = new ArrayList();
//		arrays.add(20);
//		arrays.add(30);
//		arrays.add(40);
//		arrays.add(50);
//		
//		 for (int i = 0; i < arrays.size(); i++) { System.out.println(arrays.get(i)); }
//		
//		for(Object a :arrays) {
//			System.out.println(a);
//		}
		
		//upcasting
//		List l = new ArrayList();
//		l.add(20);
//		l.add(30);
//		l.add(40);
//		l.add(50);
		 
//		for(Object a :l) {
//			System.out.println(a);
//		}
	
		
		List list =new ArrayList();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Integer lst = (Integer) it.next();
			System.out.println(lst);
		}
		
		
		
	}

}
