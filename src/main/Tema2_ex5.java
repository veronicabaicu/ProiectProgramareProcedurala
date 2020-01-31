package main;

public class Tema2_ex5 {
	public static void main(String[]args){
		int i = 1;
		int f = 1;
		int n = 13;
		for(i=1; i<n; i++)
			while (i < n) {
				f = f * i;
				System.out.println("n!=" + f);
				i++;
			}
		
// rezultatul este
//n!=1
//n!=2
//n!=6
//n!=24
//n!=120
//n!=720
//n!=5040
//n!=40320
//n!=362880
//n!=3628800
//n!=39916800
//n!=479001600
		
	}

}
