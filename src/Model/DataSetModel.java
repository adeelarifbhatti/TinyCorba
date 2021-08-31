package Model;

import GraphCore.DataSet;

public class DataSetModel extends DataSet{	
	/**
	 * 
	 */
	String country;
	String capital;
	int id;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private static final long serialVersionUID = 1L;
	public DataSetModel() {
		
	}
	public DataSetModel(int id, String country, String capital) {
		this.country=country;
		this.capital=capital;	
		this.id= id;
		
	}

}
