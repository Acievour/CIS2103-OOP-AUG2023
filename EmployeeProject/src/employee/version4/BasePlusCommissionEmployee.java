package employee.version4;

public class BasePlusCommissionEmployee extends Employee{
    private double totalSales;
    private double baseSalary;
    
    // Contructors
    public BasePlusCommissionEmployee() {
        super.empID = 0;
        totalSales = 0;
        baseSalary = 0;
    }
    
    public BasePlusCommissionEmployee(int empID, String firstName, char middleIn, String lastName) {
        super(firstName, middleIn, lastName);
        super.empID = empID;
        totalSales = 0;
        baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, String firstName, char middleIn, String lastName, MyDate empDateHired, MyDate empBirthDate, double totalSales, double baseSalary) {
        super(firstName, middleIn, lastName);
        super.empID = empID;
        super.empDateHired = empDateHired;
        super.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }
    
    // Other Operations
    public void displayInfo() {
        System.out.println("--- Base Plus Commission Employee ---");
        System.out.println("ID: " + empID);
        System.out.println("Name: " + firstName + " " + middleIn + ". " + lastName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Total Salary: " + computeSalary() + "\n");
    }
    
    // Setters and Getters
    void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    double getTotalSales() {
        return totalSales;
    }

    double getBaseSalary() {
        return baseSalary;
    }
    
    @Override
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
        salary = salary + baseSalary;
        return salary;
    }
    
    @Override
    public String employeeType() {
        return "Base Plus Commission Employee";
    }
    
    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" + "empID=" + empID + ", Name=" + firstName + " " + middleIn + ". " + lastName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + ", totalSales=" + totalSales + ", baseSalary=" + baseSalary + '}';
    }
}