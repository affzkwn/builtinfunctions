package com.lessons.builtinfunctions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuiltinfunctionsApplication {
	public static double salaryCalculator(double hoursPerWeek,double amountPerHour, int vacationDays){
		if(hoursPerWeek < 0){
			return -1;
		}

		if (amountPerHour < 0){
			return -1;
		}
		
		double weeklyPayCheck = hoursPerWeek * amountPerHour;
		double unpaidTime= vacationDays * amountPerHour * 8;
		return weeklyPayCheck*52 - unpaidTime;
	}
	

	public static void main(String[] args) {
		//SpringApplication.run(BuiltinfunctionsApplication.class, args);
		double salary = salaryCalculator(40,15,8);
		System.out.println(salary);
	}

}
