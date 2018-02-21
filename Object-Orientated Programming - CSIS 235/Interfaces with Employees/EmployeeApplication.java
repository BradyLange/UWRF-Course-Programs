package test;

import employee.fullTimeEmp;
import employee.fullTimeEmpPerm;
import employee.internEmp;
import employee.partTimeEmp;
import hrInterface.Payable;


public class driver {

	public static void main(String[] args) {
		
		//Calculating full-time employees payroll
		Payable emp1 = new fullTimeEmp(55000, 956);
		emp1.calcPayroll();
		
		//Calculating part-time employees payroll
		Payable emp2 = new partTimeEmp(40, 16.52);
		emp2.calcPayroll();
		
		//Calculating intern employees payroll
		Payable emp3 = new internEmp(566);
		emp3.calcPayroll();
		
		//Calculating permanent full-time employees payroll and the amount of accumulated hours paid off they have total
		fullTimeEmpPerm emp4 = new fullTimeEmpPerm(76500, 2300, 10);
		emp4.calcPayroll();
		emp4.absensePay();


	} //end of main method

} //end of driver class
