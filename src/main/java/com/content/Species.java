package com.content;

public class Species {
private int species_id;
private String type;
private String group;
private String lifestyle;
private String status;
public int getSpecies_id() {
	return species_id;
}
public void setSpecies_id(int species_id) {
	this.species_id = species_id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getGroup() {
	return group;
}
public void setGroup(String group) {
	this.group = group;
}
public String getLifestyle() {
	return lifestyle;
}
public void setLifestyle(String lifestyle) {
	this.lifestyle = lifestyle;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Species(int _species_id, String _type, String _group, String _lifestyle, String _status) {
	this.species_id= _species_id;
	this.type= _type;
	this.group= _group;
	this.lifestyle= _lifestyle;
	this.status= _status;
}
public Species(String _type, String _group, String _lifestyle, String _status) {
	this.type= _type;
	this.group= _group;
	this.lifestyle= _lifestyle;
	this.status= _status;
}
}
