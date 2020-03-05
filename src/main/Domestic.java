package main;

public class Domestic extends Animal {

	public Domestic() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Domestic(String culoare) {
		super(culoare);
		// TODO Auto-generated constructor stub
	}

	public Domestic(String mamifer, String culoare, int varsta) {
		super(mamifer, culoare, varsta);
		// TODO Auto-generated constructor stub
	}

	public String afiseazaDetalii() { 
		return "Animalul domestic "+ getMamifer()+ " are culoarea "+ getCuloare()+ " si varsta de "+ getVarsta()+" ani"; 
		} 
	
}
