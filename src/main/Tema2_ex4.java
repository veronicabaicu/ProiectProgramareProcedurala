package main;

public class Tema2_ex4 {
	public static void main(String[]args){
		int suma = 0;
		for(int i = 1; i < 10; i++) {
			suma += suma + i;
		}
		System.out.print("Suma este: " + suma);
		
//Rezultatul afisat este 1013
//comanda se executa de cate ori este necesar, pana cand variabila i indeplineste conditia i<10
//i++ inseamna ca noua valoare a lui i=i+1 dupa executia comenzii
//i=1, suma += suma +i = 0+0+1=1, i++ = i+1 = 1+1 = 2, dupa executarea comenzii, drept urmare noile valori sunt: suma=1, i=2
//i=2, suma=1+1+2=4, noul i=2+1=3
//i=3, suma=4+4+3=11, noul i=3+1=4
//i=4, suma=11+11+4=26, noul i=4+1=5
//i=5, suma=26+26+5=57, noul i=5+1=6
//i=6, suma=57+57+6=120, noul i=6+1=7
//i=7, suma=120+120+7=247, noul i=7+1=8
//i=8, suma=247+247+8=502, noul i=8+1=9
//i=9, suma=502+502+9=1013, noul i=9+1=10
//i=10 nu se mai executa pentru ca nu mai indeplineste conditia i<10

	}

}
