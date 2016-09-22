package com.goeuro.exportcsv.entrypoint;

import java.util.List;

import com.goeuro.exportcsv.builder.CSVBuilder;
import com.goeuro.exportcsv.exceptions.ValidationException;
import com.goeuro.exportcsv.facade.impl.CsvExporter;
import com.goeuro.exportcsv.model.Location;
import com.goeuro.exportcsv.rest.client.LocationClient;
import com.goeuro.exportcsv.validation.InputValidator;

public class CsvExportEntryPoint {

	public static void main(String[] args) throws ValidationException {
		CsvExportEntryPoint entryPoint = new CsvExportEntryPoint();
		
		try {
			entryPoint.entryPoint(args[0]);
		} catch (ValidationException e) {
			throw new ValidationException("Invalid location parameter! Please resend your request with a valid Location as parameter!");
		}
	}

	public void entryPoint(String locationName) throws ValidationException {
		new InputValidator().validade(locationName);;
		
		List<Location> locations = consumeLocationsAPIEndpoint(locationName);

		List<String[]> rows = new CSVBuilder().buildCSV(locations);
		CsvExporter exporter = new CsvExporter();
		exporter.exportCSV(rows);
	}

	public List<Location> consumeLocationsAPIEndpoint(String locationName) {
		return new LocationClient().consumeEndpoint(locationName);
	}
}
