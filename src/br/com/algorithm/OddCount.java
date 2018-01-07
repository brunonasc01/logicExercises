package br.com.algorithm;

public class OddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = oddNumbers(11, 20);
		
		System.out.println(arr.length);
		System.out.println();
		
		for(int number : arr){
			System.out.println(number);
		}
	}
	
    static int[] oddNumbers(int l, int r) {

    	int resultSize = (r-l)/2;
    	
    	if(l%2 != 0 || r%2 != 0){
    		resultSize++;
    	}

    	int result[] = new int[resultSize];
    	int index = 0;
    	
    	for(int number = l; number <= r; number++){
    		if(number %2 != 0){
    			result[index] = number;
    			index++;
    		}
    			
    	}
    	
    	return result;
    }

}
