package com.goeuro.exportcsv.builder;

import java.util.ArrayList;
import java.util.List;

import com.goeuro.exportcsv.constants.Labels;
import com.goeuro.exportcsv.model.Location;

public class CSVBuilder {
	
	public List<String[]> buildCSV(List<Location> locations) {
		
		List<String[]> rows = new ArrayList<String[]>();
		
		rows.add(Labels.labels());
		
		for(Location location : locations){
			
			rows.add(new String[] { 
									location.getId(),
									location.getKey(),
									location.getName(),
									location.getFullName(),
									location.getIataAirportCode(),
									location.getType(),
									location.getCountry(),
									location.getLatitude(),
									location.getLongitude(),
									location.getLocationId(),
									location.getInEurope(),
									location.getCountryCode(),
									location.getCoreCountry(),
									location.getDistance()
			});
			
		}
		return rows;
		
	}

}
