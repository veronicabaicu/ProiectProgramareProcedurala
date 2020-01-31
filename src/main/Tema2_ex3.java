package main;

public class Tema2_ex3 {
	public static void main(String[]args){
		int a = 3;
		if(++a < 4)
			if(a++ < 4)
				System.out.println(a);
			else
				System.out.println(a);
		
//executia codului nu genereaza niciun rezultat
//++a are ca rezultat a=1=3+1=4, deci prima conditie if nu este indeplinita, 4<4 este fals
//a doua conditie if pastreaza ultima valoare a lui a (si abia apoi o incrementeaza), insa pentru ca este falsa prima conditie, restul sintaxei nu se mai executa/citeste

		
	}

}
