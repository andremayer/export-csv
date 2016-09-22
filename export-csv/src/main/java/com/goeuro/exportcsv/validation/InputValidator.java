package com.goeuro.exportcsv.validation;

import com.goeuro.exportcsv.exceptions.ValidationException;

public class InputValidator {
	
	public void validade(String locationName) throws ValidationException{
		
		if(locationName == null || locationName == ""){
			throw new ValidationException("Invalid location parameter! Please resend your request with a valid Location as parameter!");
		}
		
	}

}
