package br.com.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmazonTest2 {

	public static void main(String[] args) {
		int capacidadeTotal = 100;
		
		int items = 2;
				
		int[] peso = {70, 10, 20};

		int min = minimumNumberOfTrips(capacidadeTotal, peso);
		
		System.out.println();
		System.out.println(min);
		
//		int[][] solucao = new int[items+1][capacidadeTotal+1];
//
//		for(int line = 0 ; line < items; line++){
//			solucao[line][0] = 0;
//		}
//		
//		for(int col = 0 ; col < capacidadeTotal; col++){
//			solucao[0][col] = 0;
//		}
//		
//		for(int item = 1 ; item <= items; item++){
//
//			for(int capacidade = 1; capacidade <= capacidadeTotal; capacidade++){
//
//				if(peso[item-1] > capacidade){
//					solucao[item][capacidade] = solucao[item-1][capacidade];
//				}
//				else {
////					V[item][weight]=Math.max (val[item-1]+V[item-1][weight-wt[item-1]], V[item-1][weight]);					
//					solucao[item][capacidade] = Math.max(valor[item-1]+solucao[item-1][capacidade-peso[item-1]], solucao[item-1][capacidade]);
//					
//				}
//			}
//		}

//		printSolution(solucao);
//		
//		System.out.println(solucao[items][capacidadeTotal]);
	}

	public static int minimumNumberOfTrips(int tripMaxWeight, int[] packagesWeight) {
	
		Arrays.sort(packagesWeight);
		
		
		
		return 0;
	}
	
//	private static void printSolution(int[][] solucao) {
//		  for (int[] rows : solucao) {
//	            for (int col : rows) {
//	                System.out.format("%5d", col);
//	            }
//	            System.out.println();
//	        }
//	}

}
