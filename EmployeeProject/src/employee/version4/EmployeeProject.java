package employee.version4;

public class EmployeeProject {

    public static void main(String[] args) { 
        EmployeeRoster empList = new EmployeeRoster(10);
        
        HourlyEmployee h1 = new HourlyEmployee(12, "James", 'D', "Ng", new MyDate(17,4,2020), new MyDate(27,7,1990), (float) 38.2, 100);
        
        HourlyEmployee h2 = new HourlyEmployee();
        
        PieceWorkerEmployee pw1 = new PieceWorkerEmployee(34, "Mitnick", 'C', "Pernites", new MyDate(12,2,2017), new MyDate(19,9,1988), 350, 10);
        
        CommissionEmployee ce1 = new CommissionEmployee(71, "John", 'A', "Gosling", new MyDate(11,12,2021), new MyDate(17,4,1989), 75000);
        
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(87, "Ann", 'V', "Lee", new MyDate(1,2,2019), new MyDate(6,12,1991), 100000, 5000);
        
        h1.displayInfo(); 
        h2.displayInfo();
        pw1.displayInfo();
        ce1.displayInfo();
        bpce1.displayInfo();
        
        empList.addEmployee(h1);
        empList.addEmployee(pw1);
        empList.addEmployee(ce1);
        empList.addEmployee(bpce1);
        
        empList.displayAllEmployee();
        
        empList.displayHE();
        empList.displayPWE();
        empList.displayCE();
        empList.displayBPCE();
        
        empList.getEmployee("Pernites");
    }
}