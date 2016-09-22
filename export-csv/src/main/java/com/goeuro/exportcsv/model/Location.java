package com.goeuro.exportcsv.model;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties( ignoreUnknown = true )
public class Location implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("_id")
	private String id;
	
	@JsonProperty("key")
	private String key;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("fullName")
	private String fullName;
	
	@JsonProperty("iata_airport_code")
	private String iataAirportCode;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("country")
	private String country;
	
	@JsonProperty("geo_position.latitude")
	private String latitude;
	
	@JsonProperty("geo_position.longitude")
	private String longitude;
	
	@JsonProperty("location_id")
	private String locationId;
	
	@JsonProperty("inEurope")
	private String inEurope;
	
	@JsonProperty("countryCode")
	private String countryCode;
	
	@JsonProperty("coreCountry")
	private String coreCountry;
	
	@JsonProperty("distance")
	private String distance;

	public Location() {
	}

	public Location(String id, String key, String name, String fullName, String iataAirportCode, String type, String country, String latitude, String longitude, String locationId, String inEurope,
			String countryCode, String coreCountry, String distance) {
		super();
		this.id = id;
		this.key = key;
		this.name = name;
		this.fullName = fullName;
		this.iataAirportCode = iataAirportCode;
		this.type = type;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
		this.locationId = locationId;
		this.inEurope = inEurope;
		this.countryCode = countryCode;
		this.coreCountry = coreCountry;
		this.distance = distance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIataAirportCode() {
		return iataAirportCode;
	}

	public void setIataAirportCode(String iataAirportCode) {
		this.iataAirportCode = iataAirportCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getInEurope() {
		return inEurope;
	}

	public void setInEurope(String inEurope) {
		this.inEurope = inEurope;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCoreCountry() {
		return coreCountry;
	}

	public void setCoreCountry(String coreCountry) {
		this.coreCountry = coreCountry;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

}
