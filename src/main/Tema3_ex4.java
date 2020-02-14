package main;

public class Tema3_ex4 {
	public static void main(String[]args){
		String String = "ProgramareProcedurala";
		int len = String.length();
		char[]Arr = new char[len];
		for (int i = 0; i < len; i++) {
			Arr[i] = String.charAt(i);
			System.out.println("Arr["+i+"]= "+Arr[i]);
			}
		}
	}

