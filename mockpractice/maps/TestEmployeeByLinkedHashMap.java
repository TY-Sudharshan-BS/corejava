package com.tyss.mockpractice.maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestEmployeeByLinkedHashMap {
	public static void main(String[] args) {
		Employee e1 = new Employee(2, "smith");
		Employee e2 = new Employee(1, "blake");
		Employee e3 = new Employee(4, "virat");
		Employee e4 = new Employee(3, "archer");
		LinkedHashMap<Employee, String> ll = new LinkedHashMap<Employee, String>();
		ll.put(e1, "HP");
		ll.put(e2, "Ty");
		ll.put(e3, "wipro");
		ll.put(e4, "ey");

		Set<Employee> s = ll.keySet();
		Iterator<Employee> itr = s.iterator();
		while (itr.hasNext()) {
			Employee e = itr.next();
			String val = ll.get(e);
			System.out.println(e + " and working in " + val);
		}
	}
}
