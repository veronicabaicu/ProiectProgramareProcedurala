package main;

public class CasaDeVacanta extends Imobil {

	public CasaDeVacanta() {
		// TODO Auto-generated constructor stub
		super();
	}

	public CasaDeVacanta(int niveluri) {
		super(niveluri);
		// TODO Auto-generated constructor stub
	}

	public CasaDeVacanta(String cladire, int niveluri, double pret) {
		super(cladire, niveluri, pret);
		// TODO Auto-generated constructor stub
	}
	
	public String afiseazaDetalii() { 
		return "Casa de vacanta "+ getCladire()+ " are un numar de niveluri egal cu "+ getNiveluri()+ " si pret de "+ getPret(); 
		} 

}
