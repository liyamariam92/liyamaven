package t1;

public class FullTimeEmployee extends EmployeAbstraction {
	int paymentPerHour=1000;
	int salary;
void calculateSalary()
{
	salary=paymentPerHour*8;
	System.out.println("salary of full time employe="+salary);
}
}
