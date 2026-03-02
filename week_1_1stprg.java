public class Week_1_1stprg {
	public static void main (String[] args) {
	int salary = 100000;
	int s = 100000;
	int annualSalary = 1000000;
	int as = 1000000;
	int flatNumber = 1;
	int flat = 1;
	int increment = salary * 10/100;
	salary = salary + increment;
	System.out.println("Annual Salary " + annualSalary);
	System.out.println("Increment = " + increment + " New Salary " + salary);
	System.out.println("Old Salary = " + (salary-increment) + "\nIncrement = " + increment + "\nNew Salary " + salary);
	}
}