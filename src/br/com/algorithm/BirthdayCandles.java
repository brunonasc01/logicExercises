package br.com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        Arrays.sort(ar);

        int candles = 0;
        int max = ar[ar.length-1];
        
        for(int i = 0; i < ar.length; i++){
            if(ar[i] == max){
                candles++;
            }
        }
        return candles;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

}
