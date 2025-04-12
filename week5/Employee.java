package week5;
import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;

    void calculateGrossSalary() {
        gross_salary = basic_salary + (basic_salary * 0.20); // Adding 20% bonus to basic salary
    }

    void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Gross Salary: " + gross_salary);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Employee emp = new Employee();
            System.out.print("Enter Employee ID: ");
            emp.emp_id = sc.nextInt();
            sc.nextLine();  // Consume newline
            System.out.print("Enter Employee Name: ");
            emp.emp_name = sc.nextLine();
            System.out.print("Enter Basic Salary: ");
            emp.basic_salary = sc.nextDouble();

            emp.calculateGrossSalary();
            emp.display();
        } // scanner automatically closed here
    }
}
