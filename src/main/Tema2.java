package main;

public class Tema2 {
	public static void main(String[]args){
		int a=3;
		int b = (a=2)*a;
		int c = b * (b=5);
		System.out.println("a=" + a + ", b=" + b +", c= " + c);
	}

//dupa ce execut Run, rezultatul este a=2, b=5, c=20
//variabila "a" avea initial valoarea 3, insa in calculul variabilei "b" a primit o noua valoare, 2, care este afisata ca rezultat
//ca urmare variabila "b" = 2*2=4
//variabila "c" ia in calcul valoarea initiala a lui "b" pe care o multiplica cu noua valoare a lui "b"
//ca urmare variabila "c" = 4*5=20
//inteleg ca valoarea variabilei ramane cea initiala daca ulterior se afla inaintea parantezei in care se redefineste valoarea variabilei, ca in cazul variabilei "b", parte din calculatia lui "c"
//deci este important unde anume plasam redefinirea valorii variabilei in ecuatie

}