package employee;

import hrInterface.Payable;

public class partTimeEmp implements Payable {
	
	//Instance variables
	private int workingHours;
	private double paymentPerHour;
	
	//Constructor
	public partTimeEmp(int workingHours, double paymentPerHour)
	{
		this.workingHours = workingHours;
		this.paymentPerHour = paymentPerHour;
	}
	
	//Calculating the part-time employees payroll
	@Override
	public void calcPayroll()
	{
		double totalSal;
		totalSal = workingHours * paymentPerHour;
		String fTotalSal = String.format("%.2f", totalSal);
		System.out.println("Part-time employees payroll: $" + fTotalSal);
	} //end of calcPayroll method

} //end of partTimeEmp class
