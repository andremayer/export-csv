package com.goeuro.exportcsv.constants;

public enum CsvSeparator {
	
	COMMA(",");

	private final String separator;

	private CsvSeparator(String separator) {
		this.separator = separator;
	}
	
	public String getSeparator(){
		return separator;
	}
}
