package main;

public class Tema3_Ex2 {
	public static void main(String[]args){
		double[] arr = new double[] {7,14,3.25,16,0.25,100.56,84,95.63,52,22.14};
		double min = arr[0];
		double max = arr[9];
		for (int i=0; i<arr.length; i++) {
			if (arr[i]<min) 			min=arr[i];
			if (arr[i]>max)             max=arr[i];
		}
		System.out.println("Minimul este: " + min );
		System.out.println("Maximul este: " + max );
	}

}
