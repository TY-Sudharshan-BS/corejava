package com.tyss.has_a.relationship;

public class TestHasA {
	public static void main(String[] args) {
		Address address= new Address(100, "Vijayanagr", "bengaluru", 560040);
		Employee e = new Employee(666, "Sudh", address);
		System.out.println("employee_id "+e.empid);
		System.out.println("employee_name "+e.name);
		System.out.println("employee_address_doorno "+e.address.door_no);
		System.out.println("employee_address_area "+e.address);
		System.out.println("employee_address_city "+e.address.city);
		System.out.println("employee_address_pincode "+e.address.pincode);
		System.out.println(address);
	}
}
