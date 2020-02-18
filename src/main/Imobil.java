package main;

public class Imobil {
	private String Cladire;
	private String Niveluri;
	private double Pret;
	
public Imobil() {
	Cladire ="";
	Niveluri = "";
	Pret = 0;
}

public Imobil(String Niveluri){
	this.Cladire = Cladire;
	this.Niveluri = "";
	this.Pret = 0;
}

public Imobil(String Cladire, String Niveluri, double Pret){
	this.Cladire = Cladire;
	this.Niveluri = Niveluri;
	this.Pret = Pret;
}

public String getCladire()
{
	return Cladire;
}	
public void setCladire(String Cladire)
{
	this.Cladire = Cladire;
}
public String getNiveluri() {
	return Niveluri;
}
public void setNiveluri(String Niveluri) {
	this.Niveluri = Niveluri;
}
public double getPret() {
	return Pret;
}
public void setPret(double Pret) {
	this.Pret = Pret;
}
}
