package employee.version3;

public class CommissionEmployee extends Employee{
    private double totalSales;
    
    // Constructors
    public CommissionEmployee() {
        empID = 0;
        empName = "XXXXX";
        totalSales = 0;
    }
    
    public CommissionEmployee(int empID, String empName) {
        super.empID = empID;
        super.empName = empName;
        totalSales = 0;
    }

    public CommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, double totalSales) {
        super.empID = empID;
        super.empName = empName;
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
        System.out.println("Name: " + empName);
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
        return "CommissionEmployee{" + "empID=" + empID + ", empName=" + empName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + ", totalSales=" + totalSales + '}';
    }
    
}