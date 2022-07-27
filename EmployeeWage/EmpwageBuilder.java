package com.Assignment.Bridlabz;

public class uc5 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;

	public static void main(String args[]) {

		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {

			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
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

			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Daily wage of employee = " + empWage);
		}
		System.out.println("Total Employee Wage = " + totalEmpWage);
	}
}
