package main;

public class Animal {
	private String mamifer;
	private String culoare;
	private int varsta;
	
public Animal() {
	mamifer ="";
	culoare = "";
	varsta = 0;
}
	
public Animal(String culoare){
	this.mamifer = mamifer;
	this.culoare = "";
	this.varsta = 0;
}

public Animal(String mamifer, String culoare, int varsta){
	this.mamifer = mamifer;
	this.culoare = culoare;
	this.varsta = varsta;
}

	public String getMamifer()
	{
		return mamifer;
	}	
	public void setMamifer(String mamifer)
	{
		this.mamifer = mamifer;
	}
	public String getCuloare() {
		return culoare;
	}
	public void setCuloare(String culoare) {
		this.culoare = culoare;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
}
