package com.content;

public class Keeper {
int keeperID;
String KeeperName;
String KeeperDOB;
String KeeperEmail;
String KeeperPhone;
String KeeperType;
public int getKeeperID() {
	return keeperID;
}
public void setKeeperID(int keeperID) {
	this.keeperID = keeperID;
}
public String getKeeperName() {
	return KeeperName;
}
public void setKeeperName(String keeperName) {
	KeeperName = keeperName;
}
public String getKeeperDOB() {
	return KeeperDOB;
}
public void setKeeperDOB(String keeperDOB) {
	KeeperDOB = keeperDOB;
}
public String getKeeperEmail() {
	return KeeperEmail;
}
public void setKeeperEmail(String keeperEmail) {
	KeeperEmail = keeperEmail;
}
public String getKeeperPhone() {
	return KeeperPhone;
}
public void setKeeperPhone(String keeperPhone) {
	KeeperPhone = keeperPhone;
}
public String getKeeperType() {
	return KeeperType;
}
public void setKeeperType(String keeperType) {
	KeeperType = keeperType;
}

public Keeper(int _keeperID, String _keeperName, String _keeperDOB, String _keeperEmail, String _keeperPhone, String _keeperType) {
	this.keeperID= _keeperID;
	this.KeeperName= _keeperName;
	this.KeeperDOB= _keeperDOB;
	this.KeeperEmail= _keeperEmail;
	this.KeeperPhone= _keeperPhone;
	this.KeeperType= _keeperType;
	
}
public Keeper(String _keeperName, String _keeperDOB, String _keeperEmail, String _keeperPhone, String _keeperType) {
	this.KeeperName= _keeperName;
	this.KeeperDOB= _keeperDOB;
	this.KeeperEmail= _keeperEmail;
	this.KeeperPhone= _keeperPhone;
	this.KeeperType= _keeperType;
	
}

}
