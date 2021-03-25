package com.tyss.practice.hasa;

public class TesthasAPhone {
	public static void main(String[] args) {
	
		//weak association
		Sim sim = new Sim("vodafone", "nano");
		Rom rom = new Rom(64, true);
		//strong association
		Battery battery = new Battery(3000, "LiIon", false);
		SmartPhone phone = new SmartPhone("Samsung", 236412322, "SMGA50", battery, sim, rom);

		System.out.println("smartphone name is " + phone.brand);
		System.out.println("smartphone name is " + phone.model_name);
		System.out.println("smartphone name is " + phone.imei);

	}
}
