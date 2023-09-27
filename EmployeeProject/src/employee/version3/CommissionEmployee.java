package employee.version3;

public class CommissionEmployee extends Employee{
    private double totalSales;
    
    // Constructors
    public CommissionEmployee() {
        super.empID = 0;
        totalSales = 0;
    }
    
    public CommissionEmployee(int empID, String firstName, char middleIn, String lastName) {
        super(firstName, middleIn, lastName);
        super.empID = empID;
        totalSales = 0;
    }

    public CommissionEmployee(int empID, String firstName, char middleIn, String lastName, MyDate empDateHired, MyDate empBirthDate, double totalSales) {
        super(firstName, middleIn, lastName);
        super.empID = empID;
        super.empDateHired = empDateHired;
        super.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
    }
    
    // Other Operations
    public double computeSalary() {
        double salary = 0;
        if(totalSales < 50000) {
            salary = totalSales * .05; 
        } else if(totalSales >= 50000 && totalSales < 100000) {
            salary = totalSales * .2;
        } else if(totalSales >= 100000 && totalSales < 500000) {
            salary = totalSales * .3;
        } else if(totalSales >= 500000) {
            salary = totalSales * .5;
        }
        return salary;
    }
    
    public void displayInfo() {
        System.out.println("--- Commission Employee ---");
        System.out.println("ID: " + empID);
        System.out.println("Name: " + firstName + " " + middleIn + ". " + lastName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Total Salary: " + computeSalary() + "\n");
    }
    
    // Setters and Getters
    void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    double getTotalSales() {
        return totalSales;
    }

    @Override
    public String toString() {
        return "CommissionEmployee{" + "empID=" + empID + ", Name=" + firstName + " " + middleIn + ". " + lastName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + ", totalSales=" + totalSales + '}';
    }
}