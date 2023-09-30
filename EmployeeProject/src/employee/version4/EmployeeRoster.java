package employee.version4;

public class EmployeeRoster extends Employee{
    private Employee[] empList;
    private int count;
    private int max;
    
    public EmployeeRoster(int max) {
        empList = new Employee[max];
        count = 0;
        this.max = max;
    }
    
    public EmployeeRoster() {
        
    }
    
    void displayAllEmployee() {
        System.out.println("--- Employee Roster ---");
        System.out.println("| ID " + "| Name " + "| Type " + "| Salary |");
        for (int i = 0; i < count; i++) {
            System.out.printf("| %d | %s, %s %c | %s | %.2f |\n", empList[i].empID, empList[i].lastName, empList[i].firstName,empList[i].middleIn, 
                              empList[i].employeeType(), empList[i].computeSalary());
        }
        System.out.println();
    }
    
    int countHE() {
        int total = 0;
        for(Employee employee : empList) {
            if(employee instanceof HourlyEmployee) {
                total++;
            }
        }
        return total;
    }
    
    int countPWE() {
        int total = 0;
        for(Employee employee : empList) {
            if(employee instanceof PieceWorkerEmployee) {
                total++;
            }
        }
        return total;
    }
    
    int countCE() {
        int total = 0;
        for(Employee employee : empList) {
            if(employee instanceof CommissionEmployee) {
                total++;
            }
        }
        return total;
    }
    
    int countBPCE() {
        int total = 0;
        for(Employee employee : empList) {
            if(employee instanceof BasePlusCommissionEmployee) {
                total++;
            }
        }
        return total;
    }
    
    void displayHE() {
        System.out.println("--- Hourly Employees ---");
        System.out.println("| ID " + "| Name " + "| Salary |");
        for(Employee employee : empList) {
            if(employee instanceof HourlyEmployee) {
                System.out.println("| " + ((HourlyEmployee) employee).empID + " | " + ((HourlyEmployee) employee).lastName + ", " + ((HourlyEmployee) employee).firstName +
                                   " " + ((HourlyEmployee) employee).middleIn + " | " + ((HourlyEmployee) employee).computeSalary());
            }
        }
        System.out.println();
    }
    
    void displayPWE() {
        System.out.println("--- Piece Worker Employees ---");
        System.out.println("| ID " + "| Name " + "| Salary |");
        for(Employee employee : empList) {
            if(employee instanceof PieceWorkerEmployee) {
                System.out.println("| " + ((PieceWorkerEmployee) employee).empID + " | " + ((PieceWorkerEmployee) employee).lastName + ", " + ((PieceWorkerEmployee) employee).firstName +
                                   " " + ((PieceWorkerEmployee) employee).middleIn + " | " + ((PieceWorkerEmployee) employee).computeSalary());
            }
        }
        System.out.println();
    }
    
    void displayCE() {
        System.out.println("--- Commission Employees ---");
        System.out.println("| ID " + "| Name " + "| Salary |");
        for(Employee employee : empList) {
            if(employee instanceof CommissionEmployee) {
                System.out.println("| " + ((CommissionEmployee) employee).empID + " | " + ((CommissionEmployee) employee).lastName + ", " + ((CommissionEmployee) employee).firstName +
                                   " " + ((CommissionEmployee) employee).middleIn + " | " + ((CommissionEmployee) employee).computeSalary());
            }
        }
        System.out.println();
    }
    
    void displayBPCE() {
        System.out.println("--- Base Plus Commission Employees ---");
        System.out.println("| ID " + "| Name " + "| Salary |");
        for(Employee employee : empList) {
            if(employee instanceof BasePlusCommissionEmployee) {
                System.out.println("| " + ((BasePlusCommissionEmployee) employee).empID + " | " + ((BasePlusCommissionEmployee) employee).lastName + ", " + ((BasePlusCommissionEmployee) employee).firstName +
                                   " " + ((BasePlusCommissionEmployee) employee).middleIn + " | " + ((BasePlusCommissionEmployee) employee).computeSalary());
            }
        }
        System.out.println();
    }
    
    boolean addEmployee(Employee e) {
        boolean result = false;
        
        if(count < empList.length) {
            empList[count] = e;
            count++;
            result = true;
        }
        
        return result;
    }
    
    boolean removeEmployee(int id) {
        boolean result = false;
        
        for (int i = 0; i < count; i++) {
            if (empList[i] != null && empList[i].getEmpID() == id) {
                empList[i] = null;
                count--;
                result = true;
            }
        }   
        
        return result;
    }
    
    EmployeeRoster getEmployee(String keyword) {
        EmployeeRoster tempoList = new EmployeeRoster(10);
        for (int i = 0; i < count; i++) {
            Employee employee = empList[i];
            if (employee != null && (employee.getLastName().toLowerCase().contains(keyword.toLowerCase()))) {
                tempoList.addEmployee(employee);
            }
        }
        tempoList.displayAllEmployee();
        return tempoList;
    }
    
    public void updateEmployee(int id, String firstName, char middleInitial, String lastName) {
        for (int i = 0; i < count; i++) {
            Employee employee = empList[i];
            if (employee != null && employee.getEmpID() == id) {
                employee.setFirstName(firstName);
                employee.setMiddleIn(middleInitial);
                employee.setLastName(lastName);
            }
        }
    }
}
