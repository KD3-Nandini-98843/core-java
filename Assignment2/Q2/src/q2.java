import java.util.Scanner;
class Employee {
    private String frist_name; 
    private String last_name;
    private double monthlysalary;
    Employee() {}
    Employee(String frist_name, String last_name, double salary) {
        this.frist_name = frist_name;
        this.last_name = last_name;
        if (salary > 0.0) {
            this.monthlysalary = salary;
        } else {
            this.monthlysalary = 0.0;
        }
    }
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first name: ");
        frist_name = sc.next();
        System.out.print("Enter a last name: ");
        last_name = sc.next();
        System.out.print("Enter monthly salary: ");
        double sal = sc.nextDouble();
        setsalary(sal); 
    }
    public void setfrist_name(String fn) {
        frist_name = fn;
    }
    public void setlast_name(String ln) {
        last_name = ln;
    }
    public void setsalary(double sal) {
        if (sal > 0.0) {
            monthlysalary = sal;
        }
    }
    public String getfrist_name() {
        return frist_name;
    }

    public String getlast_name() {
        return last_name;
    }
    public double getmonthlysalary() {
        return monthlysalary;
    }
    public double getYearlySalary() {
        return monthlysalary * 12;
    }
    public void raise(double percentage) {
        if (percentage > 0.0) {
            monthlysalary += monthlysalary * (percentage / 100.0);
        }
    }

    public void displayRecord() {
        System.out.println("First Name: " + this.frist_name);
        System.out.println("Last Name: " + this.last_name);
        System.out.printf("Yearly Salary: %.2f%n", this.getYearlySalary());
    }
}
public class q2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.acceptRecord();
        emp1.displayRecord();
        emp1.raise(10.0);
        emp1.displayRecord();
    }
}
