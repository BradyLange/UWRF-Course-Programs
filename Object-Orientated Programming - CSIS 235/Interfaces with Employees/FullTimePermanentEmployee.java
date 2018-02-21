package employee;

import hrInterface.Payable;
import hrInterface.paidTimeOff;

public class fullTimeEmpPerm implements Payable, paidTimeOff {
	
	//Instance variables
	private double baseSalary;
	private double bonus;
	private int yearsServed;
	private final int hours = 50;
	
	//Constructor
	public fullTimeEmpPerm(double baseSalary, double bonus, int yearsServed)
	{
		this.baseSalary = baseSalary;
		this.bonus = bonus;
		this.yearsServed = yearsServed;
	}
	
	@Override
	public void calcPayroll() {
		double totalSal;
		totalSal = baseSalary + bonus;
		String fTotalSal = String.format("%.2f", totalSal);
		System.out.println("Full-time permanent employees payroll: $" + fTotalSal);
	}

	@Override
	public void absensePay() {
		double moneyOffPay;
		moneyOffPay = yearsServed * hours;
		System.out.println("The full-time permanent employee has " + (int)moneyOffPay + " hours off paid over the span of " + yearsServed + " years served.");
	}
	

}
