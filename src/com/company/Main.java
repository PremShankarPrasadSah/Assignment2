package com.company;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Formate: yyyy-mm-dd");
        LocalDate date1= LocalDate.of(1996,10,06);
        LocalDate date2= LocalDate.now();
        long difference= ChronoUnit.DAYS.between(date1,date2);
        long weeks= difference/7;
        System.out.println("Weeks between "+date1+" and " +date2+" : "+weeks+" weeks ");
    }
}
