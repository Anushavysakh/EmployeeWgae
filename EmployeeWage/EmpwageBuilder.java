package com.Assignment.Bridlabz;

import java.util.ArrayList;

public class Uc13 implements IComputeEmpWage{

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	static int numOfCompany=0;
	public ArrayList<EmpWageBuilderArray1> companyEmpWageArrayList = new ArrayList<EmpWageBuilderArray1>();

	public void addCompanyEmpWage(String company,int empRatePerHour,int noOfWorkingDays,int maxHrsPerMonth) {
		companyEmpWageArrayList.add(new EmpWageBuilderArray1(company,empRatePerHour,noOfWorkingDays,maxHrsPerMonth));
		numOfCompany++;
	}

	public void computeWage() {
		for (int i = 0; i < companyEmpWageArrayList.size(); i ++) {
			companyEmpWageArrayList.get(i).setTotalEmpWage(this.computeWage(companyEmpWageArrayList.get(i)));
			System.out.println(companyEmpWageArrayList.get(i));
		}
	}

	public int empHrCheck() {
		int empHr=0;
		int empcheck=(int)Math.floor(Math.random()*10)%3;
		switch(empcheck) {
			case IS_PART_TIME:
				empHr = 4;
				break;
			case IS_FULL_TIME:
				empHr = 8;
				break;
			default:
				empHr = 0;
				break;
		}
		return empHr;
	}
	public int computeWage(EmpWageBuilderArray1 obj) {
		int totalEmpHrs=0, totalWorkingDays=0;
		while(totalEmpHrs<=obj.maxHrsPerMonth && totalWorkingDays<obj.noOfWorkingDays) {
			totalWorkingDays++;
			int empHrs = empHrCheck();
			totalEmpHrs+=empHrs;
			System.out.println("Day: "+totalWorkingDays+" Hours Worked:"+ empHrs);
			obj.setDailyWage(empHrs*obj.empRatePerHour);
		}
		return totalEmpHrs * obj.empRatePerHour;
	}

	public static void main(String[] args) {
		Uc13 obj = new Uc13();
		obj.addCompanyEmpWage("DMart",20,2,10);
		obj.addCompanyEmpWage("NE", 10, 5, 20);
		obj.addCompanyEmpWage("Reliance",20,2,10);
		obj.computeWage();
	}
}
