package employee.version2;

public class Employee {
    protected int empID;
    protected String empName;
    protected MyDate empDateHired;
    protected MyDate empBirthDate;
    
    public Employee() {
        empID = 0;
        empName = "XXXXX";
        empDateHired = new MyDate(0,0,0);
        empBirthDate = new MyDate(0,0,0);
    }

    public void setEmpName(String empName) {
        this.empName = empName;
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

    public String getEmpName() {
        return empName;
    }

    public MyDate getEmpDateHired() {
        return empDateHired;
    }

    public MyDate getEmpBirthDate() {
        return empBirthDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "empID=" + empID + ", empName=" + empName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + '}';
    }
}
