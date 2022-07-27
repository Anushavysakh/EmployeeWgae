package com.Assignment.Bridlabz;

public class Uc9 {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHrsPerMonth;
	private int totalEmpWage;

	public Uc9(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}

	public int empCheck() {

		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		int empHrs = 0;

		switch (empCheck) {
		case IS_FULL_TIME:
			empHrs = 8;
			System.out.println("Employee Full-Time");
			break;

		case IS_PART_TIME:
			empHrs = 4;
			System.out.println("Employee Part-Time");
			break;

		default:
			empHrs = 0;
			System.out.println("Employee Absent");
			break;
		}
		return empHrs;
	}

	public void wageCalculation() {

		int totalEmpHrs = 0, totalWorkingDays = 0;

		// Computation
		while (totalWorkingDays < numOfWorkingDays && totalEmpHrs <= maxHrsPerMonth) {
			totalWorkingDays++;
			int empHrs = empCheck();

			int empWage = empHrs * empRatePerHour;
			totalEmpWage += empWage;
			System.out.println("Employee Wage for day " + totalWorkingDays + " is " + empWage);
			totalEmpHrs += empHrs;
		}
		// System.out.println("Total Wage of Employee from company " + company + " is "
		// + totalEmpWage);

	}

	public String toString() {
		return "Total Employee Wage For Company " + company + " is " + totalEmpWage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Uc9 reliance = new Uc9("Reliance", 15, 10, 50);
		reliance.wageCalculation();
		System.out.println(reliance);

		Uc9 dMart = new Uc9("DMart", 20, 5, 30);
		dMart.wageCalculation();
		System.out.println(dMart);

	}
}