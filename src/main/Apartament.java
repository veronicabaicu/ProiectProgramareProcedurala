package main;

public class Apartament extends Imobil {
	private Apartament locuinta;

	public Apartament() {
		// TODO Auto-generated constructor stub
		super();
		locuinta = new Apartament ();
	}

	public Apartament(int niveluri) {
		super(niveluri);
		// TODO Auto-generated constructor stub
		locuinta = new Apartament();
	}

	public Apartament(String cladire, int niveluri, double pret) {
		super(cladire, niveluri, pret);
		// TODO Auto-generated constructor stub
		locuinta = new Apartament ();
	}
	
	public Apartament getLocuinta() {
		return locuinta;
	}
	
	public void setLocuinta(Apartament locuinta) {
		this.locuinta = locuinta; 
}
	
	public String afiseazaDetalii() { 
		return "Apartament "+ getCladire()+ " are un numar de niveluri egal cu "+ getNiveluri()+ " si pret de "+ getPret(); 
		} 

	
}