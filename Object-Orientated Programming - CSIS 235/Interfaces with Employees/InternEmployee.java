package employee;

import hrInterface.Payable;

public class internEmp implements Payable {
	
	//Instance variables
	private double stipend;
	
	//Constructor
	public internEmp(double stipend)
	{
		this.stipend = stipend;
	}
	
	//Calculating the interns payroll
	@Override
	public void calcPayroll()
	{
		String fStipend = String.format("%.2f", stipend);
		System.out.println("Intern employees payroll: $" + fStipend);
	} //end of calcPayroll method

} //end of internEmp class
