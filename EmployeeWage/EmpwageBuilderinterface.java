package com.Assignment.Bridlabz;

public interface IComputeWage2 {
	
		 public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
		 public void computeWage();
		  public int getTotalWage(String company);

}