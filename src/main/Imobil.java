package main;

public class Imobil {
	private String cladire;
	private int niveluri;
	private double pret;
	
public Imobil() {
	cladire ="";
	niveluri = 0;
	pret = 0;
}

public Imobil(int niveluri){
	this.cladire = "";
	this.niveluri = niveluri;
	this.pret = 0;
}

public Imobil(String cladire, int niveluri, double pret){
	this.cladire = cladire;
	this.niveluri = niveluri;
	this.pret = pret;
}

public String getCladire()
{
	return cladire;
}	
public void setCladire(String cladire)
{
	this.cladire = cladire;
}
public int getNiveluri() {
	return niveluri;
}
public void setNiveluri(int niveluri) {
	this.niveluri = niveluri;
}
public double getPret() {
	return pret;
}
public void setPret(double pret) {
	this.pret = pret;
}

public String afiseazaDetalii() { 
	return "Cladire "+ cladire + " are un numar de niveluri egal cu "+ niveluri+ " si pret de "+ pret; 
	} 
}
