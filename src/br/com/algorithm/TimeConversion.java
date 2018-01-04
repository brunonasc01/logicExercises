package br.com.algorithm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) throws Exception {
        
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ssaa");
        Date date = dateFormat.parse(s);
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        
        if(s.contains("PM")){
        	cal.set(Calendar.HOUR, cal.get(Calendar.HOUR)+12);
        }
        
        DateFormat format24 = new SimpleDateFormat("HH:mm:ss");
        
        return format24.format(cal.getTime());
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
