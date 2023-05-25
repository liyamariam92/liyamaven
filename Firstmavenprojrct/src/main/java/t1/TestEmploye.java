package t1;

public class TestEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeAbstraction e;
e=new Contractor();
e.calculateSalary();
e=new FullTimeEmployee();
e.calculateSalary();
	}

}
