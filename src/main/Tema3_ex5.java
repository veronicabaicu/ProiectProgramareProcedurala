package main;

public class Tema3_ex5 {
	public static void main(String[]args){
		String sir = "ProgramareProcedurala";
		String sir_nou = "";
		int len = sir.length();
		char[]Arr = new char[len];
		for (int i = 0; i < len; i++) {
			Arr[i] = sir.charAt(i);
				if (i%2==0)
					sir_nou += sir.toUpperCase().charAt(i);
				else
					sir_nou += sir.charAt(i);
			}
		System.out.println(sir_nou);
		
//conditia if determina tratamentul alternativ al caracterelor din sir
	}
}
