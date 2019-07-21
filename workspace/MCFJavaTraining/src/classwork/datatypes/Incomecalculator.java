package classwork.datatypes;

import java.util.Scanner; 

public class Incomecalculator {
	public static void main(String[]args){
	float grossIncome = 100000.00f;
	float taxBracket = 25.00f;
	float taxPercentage;
	
	
	float taxOnGrossIncome = grossIncome * taxBracket/100;
	
	float incomeAfterTax = grossIncome - taxOnGrossIncome;
	System.out.println(incomeAfterTax);	
	
	}
}
