package com.cursoceat.main;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class FormatoHoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LocalTime ahora= LocalTime.now();
System.out.println(ahora);
//imprime solo los minutos
System.out.println(ahora.getMinute());
//a la hora actual le sumamos 10 segundos		
	for (int i=1; i<=10; i++) {
		ahora=ahora.plus(1,ChronoUnit.SECONDS);
		System.out.println(ahora);
		}
		
int hora=ahora.getHour();
int minutos=ahora.getMinute();
int segundos=ahora.getSecond();
//restamos 10 horas a la hora actual
ahora=LocalTime.now();
	for (int i=1; i<=10; i++) {
	ahora=ahora.minus(1,ChronoUnit.HOURS);
	System.out.println(ahora);
}
	
//el pattern si quiero mostrar milisegundos hh:mm:ss:SSSS, 
//tantas eses como segundos quieras 
DateTimeFormatter formato= DateTimeFormatter.ofPattern("hh:mm:ss");	
System.out.println("La hora actual formateada es: " + LocalTime.now().format(formato));

	
	
	
	
	
	}

}
