package com.goeuro.exportcsv.constants;


public enum Labels {

	ID,
	
	KEY,
	
	NAME,
	
	FULLNAME,
	
	IATAAIRPORTCODE,
	
	TYPE,

	COUNTRY,
	
	LATITUDE,
	
	LONGITUDE,
	
	LOCATIONID,
	
	INEUROPE,
	
	COUNTRYCODE,
	
	CORECOUNTRY,
	
	DISTANCE;
	
	public static String[] labels() {
		Labels[] labels = values();
	    String[] names = new String[labels.length];

	    for (int i = 0; i < labels.length; i++) {
	        names[i] = labels[i].name();
	    }

	    return names;
	}
	
}
