package com.content;

public class Enclosure {
private int enclosureID;
private String EnclosureType;
private String EnclosureLocation;
public int getEnclosureID() {
	return enclosureID;
}
public void setEnclosureID(int enclosureID) {
	this.enclosureID = enclosureID;
}
public String getEnclosureType() {
	return EnclosureType;
}
public void setEnclosureType(String enclosueType) {
	EnclosureType = enclosueType;
}
public String getEnclosureLocation() {
	return EnclosureLocation;
}
public void setEnclosureLocation(String enclosureLocation) {
	EnclosureLocation = enclosureLocation;
}
public Enclosure(int _enclosureID,String _EnclosureType, String _EnclosureLocation) {
	this.enclosureID= _enclosureID;
	this.EnclosureType= _EnclosureType;
	this.EnclosureLocation= _EnclosureLocation;
	
}
public Enclosure(String _enclosureType, String _EnclosureLocation) {
	this.EnclosureType= _enclosureType;
	this.EnclosureLocation= _EnclosureLocation;
}	 
public Enclosure( String _EnclosureLocation) {
	this.EnclosureLocation= _EnclosureLocation;
 }
}

