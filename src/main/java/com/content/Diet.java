package com.content;

public class Diet {
private int dietID;
private String dietType;
private int diet_no_of_feeds;
public int getDietID() {
	return dietID;
}
public void setDietID(int dietID) {
	this.dietID = dietID;
}
public String getDietType() {
	return dietType;
}
public void setDietType(String dietType) {
	this.dietType = dietType;
}
public int getDiet_no_of_feeds() {
	return diet_no_of_feeds;
}
public void setDiet_no_of_feeds(int diet_no_of_feeds) {
	this.diet_no_of_feeds = diet_no_of_feeds;
}
 public Diet(int _dietID, String _dietType, int _diet_no_of_feeds) {
	 this.dietID= _dietID;
	 this.dietType= _dietType;
	 this.diet_no_of_feeds= _diet_no_of_feeds;
	 
 }
 public Diet( String _dietType, int _diet_no_of_feeds) {
	 this.dietType= _dietType;
	 this.diet_no_of_feeds= _diet_no_of_feeds;

 }

}