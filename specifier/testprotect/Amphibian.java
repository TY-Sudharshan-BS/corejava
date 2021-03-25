package com.tyss.specifier.testprotect;

import com.tyss.specifier.protect.Fish;

//accessing properties from different package using protected
public class Amphibian extends Fish {
	public static void main(String[] args) {
		Amphibian ab = new Amphibian();
		System.out.println(ab.name);
		ab.swim();

	}
}
