package com.sample.mahesha;

public class NotCreated extends RuntimeException {

	private static final long serialVersionUID = -5530516484144102903L;
	String outputFile;

	public NotCreated(String outputFile) {
		super(outputFile);
	}

}
