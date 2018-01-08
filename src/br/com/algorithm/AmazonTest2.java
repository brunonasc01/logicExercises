package br.com.algorithm;

import java.util.Arrays;

public class AmazonTest2 {

	public static void main(String[] args) {
		int maxMotorcycleWeight = 100;
		int[] packagesWeight = {70, 10, 20, 50,100,1};

		int min = minimumNumberOfTrips(maxMotorcycleWeight, packagesWeight);

		System.out.println(min);
	}

	public static int minimumNumberOfTrips(int tripMaxWeight, int[] packagesWeight) {
		int maxPackagePerTrip = 2;
		int trips = 0;

		int[] totalWeights = new int[packagesWeight.length];
		int[] totalPacks = new int[packagesWeight.length];

		Arrays.fill(totalPacks, 0);

		for(int i=0; i < packagesWeight.length; i++){

			if(i == 0){
				totalPacks[i] = totalPacks[i]+1;
				totalWeights[i] = packagesWeight[i];
			}
			else if(totalPacks[i-1] == maxPackagePerTrip) {
				totalPacks[i] = 1;
				totalWeights[i] = packagesWeight[i];
			}
			else if(packagesWeight[i]+totalWeights[i-1] > tripMaxWeight) {
				totalPacks[i-1] = totalPacks[i-1]+1;
				totalPacks[i] = 1;
				totalWeights[i] = packagesWeight[i];
			}
			else {
				totalPacks[i] = totalPacks[i-1]+1;
				totalWeights[i] = packagesWeight[i]+totalWeights[i-1];
			}
		}

		if(totalPacks[totalPacks.length-1] == 1){
			totalPacks[totalPacks.length-1] += 1;
		}

		for(int pack : totalPacks){
			if(pack == 2){
				trips++;
			}
		}

		return trips;
	}
}
