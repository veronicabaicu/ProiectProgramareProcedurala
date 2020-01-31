package main;

public class Tema2_ex6 {
	public static void main(String[]args){
		int a = 6, b = 2, c = 17;
		int min = a;
		if (a<b) min = a;
		else min = b;
		if (c<min) min = c;
		else min = b;
		System.out.println(min);
		
//rezultatul afisat este 2
//pentru a afla si afisa minimul dintre 3 numere, comparam pe rand 2 numere, apoi minimul lor cu cel de-al treilea
		
	}
}
