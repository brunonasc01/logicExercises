package br.com.algorithm;

import java.util.Arrays;


public class FindTheNumber {

	public static void main(String[] args) {
		int arr[] = {4, 6, 1, 5, 8};
        int n = arr.length;
        int x = 20;
//        System.out.println(search(arr, n, x));
        System.out.println(search(arr, x));
	}
	
    static String search(int arr[], int x)
    {
    	int n = arr.length;
    	
    	if(arr[n-1] == x){
    		return "YES";
    	}
    	else if( n >1){
    		int[] newArray = Arrays.copyOfRange(arr, 0, n-1);
    		
    		return search(newArray, x);
    	}
    	else {
    		return "NO";
    	}
    }

}
