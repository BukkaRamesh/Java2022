package com.sample.mahesha;

public class OverFlowMemory extends RuntimeException {


	private static final long serialVersionUID = 6002161744355599321L;
	
	String over;

	public OverFlowMemory(String over) {
		super(over);
		
	}
}
