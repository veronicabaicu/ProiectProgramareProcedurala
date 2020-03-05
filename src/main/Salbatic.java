package main;

public class Salbatic extends Animal {

	public Salbatic() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Salbatic(String culoare) {
		super(culoare);
		// TODO Auto-generated constructor stub
	}

	public Salbatic(String mamifer, String culoare, int varsta) {
		super(mamifer, culoare, varsta);
		// TODO Auto-generated constructor stub
	}
	
	public String afiseazaDetalii() { 
		return "Animalul salbatic "+ getMamifer()+ " are culoarea "+ getCuloare()+ " si varsta de "+ getVarsta()+" ani"; 
		} 

}
