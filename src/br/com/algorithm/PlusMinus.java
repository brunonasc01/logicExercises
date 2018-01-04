package br.com.algorithm;

import java.util.Scanner;

public class PlusMinus {

	static void plusMinus(int[] arr) {
		double[] result = new double[3];

		for(int n : arr){
			if(n > 0){
				result[0] += 1;
			}
			else if( n < 0){
				result[1] += 1;
			}
			else {
				result[2] += 1;
			}
		}

		for (double l : result) {
			//formata com %f e adiciona quebra de linha com %n
			 System.out.format("%f%n", l/arr.length);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int arr_i = 0; arr_i < n; arr_i++){
			arr[arr_i] = in.nextInt();
		}
		plusMinus(arr);
		in.close();
	}

}
