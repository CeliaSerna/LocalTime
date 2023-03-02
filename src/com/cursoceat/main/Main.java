package com.cursoceat.main;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner(System.in);
	/*
	System.out.println("Escribe tu fecha de nacimiento[dd-mm-aaaa]");
	String fechaN= entrada.nextLine();
	String [] fechaNdes= fechaN.split("-");
	String diaN=  fechaNdes[0];
	String mesN=  fechaNdes[1];
	String anioN= fechaNdes[2];
	//convertir esta fecha en un objeto tipo localDate
	//parse --> convierte -> hay que pasarle un solo string
	fechaN= anioN+"-"+ mesN+"-"+diaN;
	LocalDate fechaNN= LocalDate.parse(fechaN);
	//OBTENER DIA DE LA SEMANA
	
	System.out.println("El día que naciste "+fechaNN.getDayOfWeek());
	//plus + minus  dias - mes- años
	LocalDate mas70= fechaNN.plus(70,ChronoUnit.YEARS);
	System.out.println("Te jubilarás en el año "+mas70);
	//System.out.println("Te jubilarás en el año "+fechaNN.plus(70,ChronoUnit.YEARS));
	
	
	//guardar en base de datos aaaa-mm-dd
	//utilizando localdate*/
	LocalDate hoy= LocalDate.now();
	/*
	System.out.println("fecha de nacimiento -> " + fechaN);	
	System.out.println("Hoy es-> " + hoy);	
	System.out.println(hoy.getDayOfWeek());
	System.out.println(hoy.getMonth());
	System.out.println(hoy.getYear());

	//period 
	Period aniosXjubilar=Period.between(mas70, hoy);
	System.out.println("Te faltan para jubilarte "+ aniosXjubilar);
	System.out.println("Escribe la fecha de nacimiento de tu madre [yyyy-mm-dd]");
	
	LocalDate fechaMama= LocalDate.parse(entrada.nextLine());
	Period x=Period.between(fechaNN, fechaMama);
	System.out.println("Mi madre tenía "+ x);
	
	//años bisiestos
	System.out.println("Escribe una fecha cualquiera [yyyy-mm-dd]");
	LocalDate bisiesto=LocalDate.parse(entrada.nextLine());
	boolean bisiestoR=bisiesto.isLeapYear();
	if(bisiestoR) {
		System.out.println("Es un año bisiesto ");
	}else {
		System.out.println("No es un año bisiesto ");
	}*/
	//formatear segun nuestro tipo de fecha --> pattern
	
	///*********LINEA PARA FORMATEAR UNA FECHA **************///////
	DateTimeFormatter formato=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault());
	System.out.println(hoy.format(formato));
	DateTimeFormatter formato1=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
	System.out.println(hoy.format(formato1));
	DateTimeFormatter formato2=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault());
	System.out.println(hoy.format(formato2));
	DateTimeFormatter formato3=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.getDefault());
	System.out.println(hoy.format(formato3));//mes en mayuscula MM 
	DateTimeFormatter formato0=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println(hoy.format(formato0));
	}

}
