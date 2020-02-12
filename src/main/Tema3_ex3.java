package main;

public class Tema3_ex3 {
	public static void main(String[]args){
		int[] arr = new int[] {7,14,3,-16,0,100,84,95,52,22};
		for (int i=0; i<arr.length; i++) {
			if (arr[i]<0)
				System.out.println("Valoarea negativa se afla pe pozitia "+(i+1)+" in array.");
			//ia executie se afiseaza mesajul "Valoarea negativa se afla pe pozitia 4 in array."
			//dat fiind ca i incepe de la zero, pozitia valorii negative este egala cu 1+1 

		}
	}
}
