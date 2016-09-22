package com.goeuro.exportcsv.rest.client;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import com.goeuro.exportcsv.model.Location;

public class LocationClient {
	
	private Client client;
	

	public LocationClient() {
		this.client = getInstance();
	}

	public List<Location> consumeEndpoint(String locationName) {
		WebTarget target = client.target("http://api.goeuro.com/api/v2/position/suggest/en/" + locationName);
		
		List<Location> locations = target.request().get().readEntity(new GenericType<List<Location>>() {});
		
		return locations;
	}
	
	public Client getInstance(){
		return ClientBuilder.newClient();
	}

}
