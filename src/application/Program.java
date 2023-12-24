package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter employee details: ");
		
		System.out.println("Name: ");
		employee.name = scanner.nextLine();
		
		System.out.println("Gross Salary: ");
		employee.grossSalary = scanner.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = scanner.nextDouble();
		
		
		scanner.close();
	}

}
