package com.content;

public class Animal {
	private int Animal_id;
	private String name;
	private String gender;
	private int year;
	private int S_ID;
	private int K_ID;
	private int E_ID;
	private int D_ID;
	private String keepername;
	private int totalanimals;
	
	public String getKeepername() {
		return keepername;
	}
	public void setKeepername(String keepername) {
		this.keepername = keepername;
	}
	public int getTotalanimals() {
		return totalanimals;
	}
	public void setTotalanimals(int totalanimals) {
		this.totalanimals = totalanimals;
	}
	public int getAnimal_id() {
		return Animal_id;
	}
	public void setAnimal_id(int animal_id) {
		Animal_id = animal_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getS_ID() {
		return S_ID;
	}
	public void setS_ID(int s_ID) {
		S_ID = s_ID;
	}
	public int getK_ID() {
		return K_ID;
	}
	public void setK_ID(int k_ID) {
		K_ID = k_ID;
	}
	public int getE_ID() {
		return E_ID;
	}
	public void setE_ID(int e_ID) {
		E_ID = e_ID;
	}
	public int getD_ID() {
		return D_ID;
	}
	public void setD_ID(int d_ID) {
		D_ID = d_ID;
	}
	public Animal(int _Animal_id, String _name, String _gender, int _year, int _S_ID, int _K_ID, int _E_ID, int _D_ID ) {
		this.Animal_id= _Animal_id;
		this.name= _name;
		this.gender= _gender;
		this.year= _year;
		this.S_ID= _S_ID;
		this.K_ID= _K_ID;
		this.E_ID= _E_ID;
		this.D_ID= _D_ID;
	}
	public Animal( String _name, String _gender, int _year, int _S_ID, int _K_ID, int _E_ID, int _D_ID ) {
		this.name= _name;
		this.gender= _gender;
		this.year= _year;
		this.S_ID= _S_ID;
		this.K_ID= _K_ID;
		this.E_ID= _E_ID;
		this.D_ID= _D_ID;
	}
	public Animal (int _animal_id,String _name,String _gender,int _year,int _K_ID,String _keepername) {
		this.Animal_id=_animal_id;
		this.name=_name;
		this.gender=_gender;
		this.year=_year;
		this.K_ID=_K_ID;
		this.keepername=_keepername;
	}
	public Animal (String _keepername, int _totalanimals) {
		this.keepername=_keepername;
		this.totalanimals=_totalanimals;
	}
}
