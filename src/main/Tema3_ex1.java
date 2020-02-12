package main;

public class Tema3_ex1 {
	public static void main(String[]args){
		double x = 5.39, y = 7.48, z = 8.21;
		double[] arr = new double[3];
		arr[0] = x;
		arr[1] = y;
		arr[2] = z;
		for (int i = 0; i<arr.length; i++) {
			System.out.println("Element at index"+ i +": "+ arr[i]);
		}
	}
}
