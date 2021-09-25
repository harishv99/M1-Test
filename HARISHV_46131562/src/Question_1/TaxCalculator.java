package Question_1;

import java.util.Scanner;

public class TaxCalculator
{
	public static double taxableAmount(double monthlySalary) 
	{
		double annual_salary = monthlySalary * 12;
		if (annual_salary <= 250000)
			return 0;
		else if (annual_salary >= 250001 && annual_salary <= 500000)
			return (annual_salary - 250000) * 0.1;
		else if (annual_salary >= 500001 && annual_salary <= 1000000)
			return 250000 * 0.1 + (annual_salary - 500000) * 0.2;
		else
			return 250000 * 0.1 + 500000 * 0.2 + (annual_salary - 1000000) * 0.3;

	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the monthly salary");
		double monthly_salary = s.nextDouble();
		double tax = taxableAmount(monthly_salary);
		System.out.println("Tax amount : " + tax);
	}
}
