package br.com.algorithm;

import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {
        String[] splitDate = s.split(":");

        String ampm = splitDate[splitDate.length-1].substring(2);
        splitDate[2] = splitDate[2].substring(0,2);

        int hour = Integer.valueOf(splitDate[0]);
        int minute = Integer.valueOf(splitDate[1]);
        int second = Integer.valueOf(splitDate[2]);

        if(ampm.equals("PM") && hour != 12){
        	hour = hour + 12;
        }
        else if(ampm.equals("AM") && hour == 12){
        	hour = 0;
        }

        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
