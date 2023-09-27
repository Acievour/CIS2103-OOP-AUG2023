package employee.version3;

public class Employee extends Name{
    protected int empID;
    protected MyDate empDateHired;
    protected MyDate empBirthDate;
    
    public Employee(String firstName, char middleIn, String lastName) {
        super(firstName, middleIn, lastName);
    }
    
    public Employee() {
        empID = 0;
        empDateHired = new MyDate(0,0,0);
        empBirthDate = new MyDate(0,0,0);
    }
    
    public void setEmpDateHired(MyDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthDate(MyDate empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public int getEmpID() {
        return empID;
    }

    public MyDate getEmpDateHired() {
        return empDateHired;
    }

    public MyDate getEmpBirthDate() {
        return empBirthDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + '}';
    }
}
