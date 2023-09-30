package employee.version4;

public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private float ratePerHour;
    
    // Constructors
    public HourlyEmployee() {
        super.empID = 0;
        totalHoursWorked = 0;
        ratePerHour = 0;
    }
    
    public HourlyEmployee(int empID, String firstName, char middleIn, String lastName) {
        super(firstName, middleIn, lastName);
        super.empID = empID;
        totalHoursWorked = 0;
        ratePerHour = 0;
    }

    public HourlyEmployee(int empID, String firstName, char middleIn, String lastName, MyDate empDateHired, MyDate empBirthDate, float totalHoursWorked, float ratePerHour) {
        super(firstName, middleIn, lastName);
        super.empID = empID;
        super.empDateHired = empDateHired;
        super.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    // Other Operations
    
    
    public void displayInfo() {
        System.out.println("--- Hourly Employee ---");
        System.out.println("ID: " + empID);
        System.out.println("Name: " + firstName + " " + middleIn + ". " + lastName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Hours Worked: " + totalHoursWorked);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Total Salary: " + computeSalary() + "\n");
    }
    
    // Setters and Getters
    void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }
    
    void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    float getTotalHoursWorked() {
        return totalHoursWorked;
    }
    
    float getRatePerHour() {
        return ratePerHour;
    }

    @Override
    public double computeSalary() {
        double salary = 0;
        if(totalHoursWorked > 40) {
            salary = (40 * ratePerHour) + ((totalHoursWorked - 40) * (ratePerHour * 1.5));
        } else {
            salary = totalHoursWorked * ratePerHour;
        }
        return salary;
    }
    
    @Override
    public String employeeType() {
        return "Hourly Employee";
    }
    
    @Override
    public String toString() {
        return "HourlyEmployee{" + "empID=" + empID + ", Name=" + firstName + " " + middleIn + ". " + lastName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + ", totalHoursWorked=" + totalHoursWorked + ", ratePerHour=" + ratePerHour + '}';
    }
}