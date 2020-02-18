package main;

public class Animal {
	private String Mamifer;
	private String Culoare;
	private int Varsta;
	
public Animal() {
	Mamifer ="";
	Culoare = "";
	Varsta = 0;
}
	
public Animal(String Culoare){
	this.Mamifer = Mamifer;
	this.Culoare = "";
	this.Varsta = 0;
}

public Animal(String Mamifer, String Culoare, int Varsta){
	this.Mamifer = Mamifer;
	this.Culoare = Culoare;
	this.Varsta = Varsta;
}

	public String getMamifer()
	{
		return Mamifer;
	}	
	public void setMamifer(String Mamifer)
	{
		this.Mamifer = Mamifer;
	}
	public String getCuloare() {
		return Culoare;
	}
	public void setCuloare(String Culoare) {
		this.Culoare = Culoare;
	}
	public int getVarsta() {
		return Varsta;
	}
	public void setVarsta(int Varsta) {
		this.Varsta = Varsta;
	}
	
}
