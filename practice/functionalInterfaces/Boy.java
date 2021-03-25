package com.tyss.practice.functionalInterfaces;

@FunctionalInterface
public interface Boy extends Marker { // can extend since it is a marker interface
	void play();
}
