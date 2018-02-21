package employee;

import hrInterface.Payable;

public class fullTimeEmp implements Payable {
	
	//Instance variables
	private double baseSalary;
	private double bonus;
	
	//Constructor
	public fullTimeEmp(double baseSalary, double bonus)
	{
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}

	//Calculating the full-time employees salary that includes a bonus
	@Override
	public void calcPayroll()
	{
		double totalSal;
		totalSal = baseSalary + bonus;
		String fTotalSal = String.format("%.2f", totalSal);
		System.out.println("Full-time employees payroll: $" + fTotalSal);
	} //end of calcPayroll method
	
} //end of fullTimeEmp class
