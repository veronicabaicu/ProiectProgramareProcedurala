package main;

public class Apartament extends Imobil {
	
	public Apartament() {
		// TODO Auto-generated constructor stub
		super();
		}

	public Apartament(int niveluri) {
		super(niveluri);
		// TODO Auto-generated constructor stub
		}

	public Apartament(String cladire, int niveluri, double pret) {
		super(cladire, niveluri, pret);
		// TODO Auto-generated constructor stub
			}
	
	
	public String afiseazaDetalii() { 
		return "Apartament "+ getCladire()+ " are un numar de niveluri egal cu "+ getNiveluri()+ " si pret de "+ getPret(); 
		} 

	
}