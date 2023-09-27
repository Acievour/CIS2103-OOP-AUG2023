package employee.version2;

public class BasePlusCommissionEmployee extends Employee{
    private double totalSales;
    private double baseSalary;
    
    // Contructors
    public BasePlusCommissionEmployee() {
        empID = 0;
        empName = "XXXXX";
        totalSales = 0;
        baseSalary = 0;
    }
    
    public BasePlusCommissionEmployee(int empID, String empName) {
        super.empID = empID;
        super.empName = empName;
        totalSales = 0;
        baseSalary = 0;
    }

    public BasePlusCommissionEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, double totalSales, double baseSalary) {
        super.empID = empID;
        super.empName = empName;
        super.empDateHired = empDateHired;
        super.empBirthDate = empBirthDate;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
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
        salary = salary + baseSalary;
        return salary;
    }
    
    public void displayInfo() {
        System.out.println("--- Base Plus Commission Employee ---");
        System.out.println("ID: " + empID);
        System.out.println("Name: " + empName);
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
    public String toString() {
        return "BasePlusCommissionEmployee{" + "empID=" + empID + ", empName=" + empName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + ", totalSales=" + totalSales + ", baseSalary=" + baseSalary + '}';
    }
    
}