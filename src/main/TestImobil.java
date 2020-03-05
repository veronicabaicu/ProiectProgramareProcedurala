package main;

public class TestImobil {
	public static void main(String[]args) {
		Imobil imob = new Imobil();
		
		imob.setCladire("casa");
		imob.setNiveluri(2);
		imob.setPret(1000000.99);
		
		Imobil imob1 = new Imobil();
		imob1.setCladire("apartament");
		imob1.setNiveluri(1);
		imob1.setPret(300000.50);
		
		Imobil i = new Imobil("vila", 4, 250000000.00);
		
		System.out.println("Cladire: " + imob.getCladire() + "\nCuloare: " + imob.getNiveluri() + "\nVarsta: " + imob.getPret());
		System.out.println();
		
		Imobil imob2 = new Imobil();
		imob2.setCladire("casadevacanta");
		imob2.setNiveluri(2);
		imob2.setPret(9999999.99);

		System.out.println("Cladire: " + imob1.getCladire() + "\nCuloare: " + imob1.getNiveluri() + "\nVarsta: " + imob1.getPret());
		System.out.println();
		
		System.out.println("Cladire: " + imob2.getCladire() + "\nCuloare: " + imob2.getNiveluri() + "\nVarsta: " + imob2.getPret());
		System.out.println();

		
		Apartament locuinta1 = new Apartament();
		locuinta1.setCladire("garsoniera");
		locuinta1.setNiveluri(1);
		locuinta1.setPret(50000.00);
		
		System.out.println(locuinta1.afiseazaDetalii());
	
		CasaDeVacanta locuinta2 = new CasaDeVacanta();
		locuinta2.setCladire("penthouse");
		locuinta2.setNiveluri(2);
		locuinta2.setPret(1000000.00);
		
		System.out.println(locuinta2.afiseazaDetalii());
		
	}
}
