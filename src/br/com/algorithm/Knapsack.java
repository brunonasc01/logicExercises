package br.com.algorithm;

public class Knapsack {

	public static void main(String[] args) {

		int capacidadeTotal = 4;
		
		int items = 2;
		
		int[] valor = {100, 200};
		int[] peso = {4 , 2};

		int[][] solucao = new int[items+1][capacidadeTotal+1];

		for(int line = 0 ; line < items; line++){
			solucao[line][0] = 0;
		}
		
		for(int col = 0 ; col < capacidadeTotal; col++){
			solucao[0][col] = 0;
		}
		
		for(int item = 1 ; item <= items; item++){

			for(int capacidade = 1; capacidade <= capacidadeTotal; capacidade++){

				if(peso[item-1] > capacidade){
					solucao[item][capacidade] = solucao[item-1][capacidade];
				}
				else {
//					V[item][weight]=Math.max (val[item-1]+V[item-1][weight-wt[item-1]], V[item-1][weight]);					
					solucao[item][capacidade] = Math.max(valor[item-1]+solucao[item-1][capacidade-peso[item-1]], solucao[item-1][capacidade]);
					
				}
			}
		}

		printSolution(solucao);
		
		System.out.println(solucao[items][capacidadeTotal]);
	}

	private static void printSolution(int[][] solucao) {
		  for (int[] rows : solucao) {
	            for (int col : rows) {
	                System.out.format("%5d", col);
	            }
	            System.out.println();
	        }
	}

}
