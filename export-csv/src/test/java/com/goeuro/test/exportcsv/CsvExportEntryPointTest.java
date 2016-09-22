package com.goeuro.test.exportcsv;

import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mockito;

import com.goeuro.exportcsv.entrypoint.CsvExportEntryPoint;
import com.goeuro.exportcsv.exceptions.ValidationException;
import com.goeuro.exportcsv.model.Location;

public class CsvExportEntryPointTest {

	@Test
	public void testEntryPointValidLocation() throws ValidationException{
		CsvExportEntryPoint entryPointMocked = Mockito.mock(CsvExportEntryPoint.class);
		ArrayList<Location> mockedLocations = new ArrayList<Location>();
		mockedLocations.add(new Location("1234", "999", "Berlin", "Berlin, Germany", "XXX", "airport", "Germany", "", "","1", "true","1", "", ""));
		
		Mockito.when((entryPointMocked.consumeLocationsAPIEndpoint(Mockito.anyString()))).thenReturn(mockedLocations);
		entryPointMocked.entryPoint("Berlin");
		
	}

	@Test(expected=ValidationException.class)
	public void testEntryPointBlankLocation() throws ValidationException{
		new CsvExportEntryPoint().entryPoint("");
	}
	
	@Test(expected=ValidationException.class)
	public void testEntryPointWithNullLocation() throws ValidationException{
		new CsvExportEntryPoint().entryPoint(null);
	}
	
}
