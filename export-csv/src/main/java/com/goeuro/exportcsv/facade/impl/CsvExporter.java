package com.goeuro.exportcsv.facade.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVWriter;

import com.goeuro.exportcsv.constants.CsvSeparator;
import com.goeuro.exportcsv.facade.CsvExporterFacade;

public class CsvExporter implements CsvExporterFacade {

	public void exportCSV(List<String[]> rows) {
		try {
			CSVWriter writer = new CSVWriter(new FileWriter("locations.csv"), CsvSeparator.COMMA.getSeparator().charAt(0));
			writer.writeAll(rows);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
