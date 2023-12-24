package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary(double salaryCalc) {
		return this.grossSalary - this.tax;
	}
	
	public void showResult() {
		System.out.println("Employee: " + name + " $ " + netSalary(grossSalary));
	}
	
	public double increaseSalary(double salaryCalcPlus) {
		return netSalary(salaryCalcPlus) + ((this.grossSalary / 100) *salaryCalcPlus);
	}

}
