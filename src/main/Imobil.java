package main;

public class Imobil {
	private String Cladire;
	private int Niveluri;
	private double Pret;
	
public Imobil() {
	Cladire ="";
	Niveluri = 0;
	Pret = 0;
}

public Imobil(int Niveluri){
	this.Cladire = "";
	this.Niveluri = Niveluri;
	this.Pret = 0;
}

public Imobil(String Cladire, int Niveluri, double Pret){
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
public int getNiveluri() {
	return Niveluri;
}
public void setNiveluri(int Niveluri) {
	this.Niveluri = Niveluri;
}
public double getPret() {
	return Pret;
}
public void setPret(double Pret) {
	this.Pret = Pret;
}
}
