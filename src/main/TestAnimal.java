package main;

public class TestAnimal {
	public static void main(String[]args) {
		Animal anim = new Animal();
		
		anim.setMamifer("elefant");
		anim.setCuloare("gri");
		anim.setVarsta(5);
		
		Animal anim1 = new Animal();
		anim1.setMamifer("tigru");
		anim1.setCuloare("galbennegru");
		anim1.setVarsta(3);
		
		Animal a = new Animal("leu", "bej", 6);
		
		System.out.println("Mamifer: " + anim.getMamifer() + "\nCuloare: " + anim.getCuloare() + "\nVarsta: " + anim.getVarsta());
		System.out.println();
		
		Animal anim2 = new Animal();
		anim2.setMamifer("vulpe");
		anim2.setCuloare("alba");
		anim2.setVarsta(1);
	
		System.out.println("Mamifer: " + anim1.getMamifer() + "\nCuloare: " + anim1.getCuloare() + "\nVarsta: " + anim1.getVarsta());
		System.out.println();
		
		System.out.println("Mamifer: " + anim2.getMamifer() + "\nCuloare: " + anim2.getCuloare() + "\nVarsta: " + anim2.getVarsta());
		System.out.println();
		
	}

}
