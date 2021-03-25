package com.tyss.mockpractice.arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Register {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(5);
		for (Integer i : al) {
			System.out.println(i);
		}
		Collections.sort(al);
		System.out.println(al);
	}
}
