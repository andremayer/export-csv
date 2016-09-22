package com.goeuro.exportcsv.facade;

import java.util.List;

public interface CsvExporterFacade {
	
	public void exportCSV(List<String[]> rows);

}
