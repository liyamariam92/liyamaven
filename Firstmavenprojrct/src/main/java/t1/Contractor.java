package t1;

public class Contractor extends EmployeAbstraction{
	int workingHours=25;
	int paymentPerHour=500;
	int salary;
void calculateSalary()
{
	salary=workingHours*paymentPerHour;
	System.out.println("salary of contract employe="+salary);
}
}
