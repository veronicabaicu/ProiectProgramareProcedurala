package main;

public class Tema3_ex6 {
	public static void main(String[]args){
	    int[] vector; 
	    vector = new int[] {100,200,300,400}; 
	    double[] vector_nou; 
	    vector_nou = new double[vector.length]; 
        double d = 3.14; 
        for(int i = 0; i<vector.length; i++) 
         { 
         	vector_nou[i] = vector[i] + d; 
           System.out.print(+ vector_nou[i] + ","); 
         }
	}

}
