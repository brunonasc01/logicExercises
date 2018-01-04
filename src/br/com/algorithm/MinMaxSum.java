package br.com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

	static void miniMaxSum(int[] arr) {
//		for(int i = 0; i < arr.length; i++){
//			for(int j = 0; j < arr.length; j++){
//				if(i != j){
//					result[i] += arr[j];
//				}
//			}
//		}
//		
//		long min = 0;
//		long max = 0;
//		
//		for(long value : result){
//			System.out.println(value);
//			if(value > max){
//				max = value;
//			}
//			else if(min == 0 || value < min){
//				min = value;
//			}
//		}
		
		int soma = 0;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++){
			soma += arr[i];
		}
		
		System.out.format("%d %d",(soma - arr[arr.length-1]), (soma - arr[0]));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }

}
