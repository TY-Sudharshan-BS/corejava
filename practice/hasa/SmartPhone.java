package com.tyss.practice.hasa;

public class SmartPhone {
	String brand;
	long imei;
	String model_name;
	Battery battery;
	Sim sim;
	Rom rom;
	public SmartPhone(String brand, long imei, String model_name, Battery battery, Sim sim, Rom rom) {
		super();
		this.brand = brand;
		this.imei = imei;
		this.model_name = model_name;
		this.battery = battery;
		this.sim = sim;
		this.rom = rom;
	}
}
