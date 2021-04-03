package com.example.demo;

public class Bus {
	private int busNo;
	private String busName;

	public Bus(int busNo, String busName) {
		super();
		this.busNo = busNo;
		this.busName = busName;
	}

	public int getBusNo() {
		return busNo;
	}

	public String getBusName() {
		return busName;
	}

	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", busName=" + busName + "]";
	}

}
